package uz.jurayev.vertx_starter.eventbus;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestResponseExample {

  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    vertx.deployVerticle(new RequestExample());
    vertx.deployVerticle(new ResponseExample());

  }

  static class RequestExample extends AbstractVerticle {
    public static final Logger LOG = LoggerFactory.getLogger(RequestExample.class);
    private static final String ADDRESS = "my.request.address";

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      var eventBus = vertx.eventBus();
      final String message = "Hello Vertx!!!";
      LOG.debug("Sending: {}", message);
      eventBus.<String>request(ADDRESS, message, event -> {
        LOG.debug("Response: {}", event.result().body());
      });
    }
  }

  static class ResponseExample extends AbstractVerticle {
    public static final Logger LOG = LoggerFactory.getLogger(ResponseExample.class);

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().<String>consumer(RequestExample.ADDRESS, handler -> {
        LOG.debug("Received message: {}", handler.body());
        handler.reply("Received your message. Thanks");
      });
    }
  }
}
