package uz.jurayev.vertx_starter.worker;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkerVerticleExample extends AbstractVerticle {

  public static final Logger LOG = LoggerFactory.getLogger(WorkerVerticleExample.class);
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("worker verticle deployed");
    startPromise.complete();
    Thread.sleep(5000);
    LOG.debug("worker verticle done");
  }
}
