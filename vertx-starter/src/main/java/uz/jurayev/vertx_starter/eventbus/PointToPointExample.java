package uz.jurayev.vertx_starter.eventbus;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PointToPointExample {

  public static final Logger LOG = LoggerFactory.getLogger(PointToPointExample.class);

  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    vertx.deployVerticle(new Sender());
    vertx.deployVerticle(new Receiver());

  }

  static class Sender extends AbstractVerticle {

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.setPeriodic(2000, event -> {
        vertx.eventBus().send(Sender.class.getName(), "Hello vertx!");
      });
    }
  }
  static class Receiver extends AbstractVerticle {

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().<String>consumer(Sender.class.getName(), event -> {
        LOG.debug("Received message: {}", event.body());
      });
    }
  }
}
