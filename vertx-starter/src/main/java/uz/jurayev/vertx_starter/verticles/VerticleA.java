package uz.jurayev.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleA extends AbstractVerticle {

  public static final Logger LOG = LoggerFactory.getLogger(VerticleA.class);

  @Override
  public void start(final Promise<Void> startPromise) throws Exception {
    LOG.debug("Start {}", getClass().getName());
    vertx.deployVerticle(new VerticleAA(), whenDeployed -> {
      LOG.debug("Deployed {}", VerticleAA.class.getName());
      vertx.undeploy(whenDeployed.result());
    });
    vertx.deployVerticle(new VerticleBB(), whenDeployed -> {
      LOG.debug("Deployed {}", VerticleBB.class.getName());
      //do not undeploy
    });
    startPromise.complete();
  }
}
