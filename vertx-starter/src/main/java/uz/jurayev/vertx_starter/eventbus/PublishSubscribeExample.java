package uz.jurayev.vertx_starter.eventbus;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class PublishSubscribeExample {

  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    vertx.deployVerticle(new Publish());
    vertx.deployVerticle(new Subscribe());
    vertx.deployVerticle(Subscribe2.class.getName(), new DeploymentOptions().setInstances(2));

  }

  public static class Publish extends AbstractVerticle {
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.setPeriodic(Duration.ofSeconds(10).toMillis(), event -> {
        vertx.eventBus().publish(Publish.class.getName(), "Hello Vertx!");
      });
    }
  }
  public static class Subscribe extends AbstractVerticle {
    public static final Logger LOG = LoggerFactory.getLogger(Subscribe.class);

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().<String>consumer(Publish.class.getName(), event -> {
        LOG.debug("Received message: {}", event.body());
      });
    }
  }
  public static class Subscribe2 extends AbstractVerticle {
    public static final Logger LOG = LoggerFactory.getLogger(Subscribe2.class);

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
      startPromise.complete();
      vertx.eventBus().<String>consumer(Publish.class.getName(), event -> {
        LOG.debug("Received message: {}", event.body());
      });
    }
  }
}
