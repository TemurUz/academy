package uz.jurayev.vertx_starter.worker;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerThreadExample extends AbstractVerticle {

  public static final Logger LOG = LoggerFactory.getLogger(WorkerThreadExample.class);

  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    vertx.deployVerticle(new WorkerThreadExample());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    vertx.deployVerticle(new WorkerVerticleExample(),
      new DeploymentOptions()
        .setWorker(true)
        .setWorkerPoolSize(1)
        .setWorkerPoolName("worker verticle running"));
    startPromise.complete();
    executeWorkerThread();

  }
  private void executeWorkerThread() {
    vertx.executeBlocking(event -> {
      LOG.debug("Executing blocking code");
      try {
        Thread.sleep(5000);
        event.complete();
//        event.fail("Force Fail!");
      } catch (InterruptedException e) {
        LOG.error("Failed ", e);
        event.fail(e);
      }
    }, result -> {
      if (result.succeeded()){
        LOG.debug("Blocking call done");
      } else {
        LOG.error("Blocking call failed", result.cause());
      }
    });
  }
}
