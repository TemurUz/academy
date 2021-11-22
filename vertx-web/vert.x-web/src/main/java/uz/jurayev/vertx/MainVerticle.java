package uz.jurayev.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainVerticle extends AbstractVerticle {

  public static final Logger LOG = LoggerFactory.getLogger(MainVerticle.class);

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.exceptionHandler(error -> {
      LOG.debug("Error:", error);
    });
    vertx.deployVerticle(new MainVerticle(), ar -> {
      if (ar.failed()) {
        LOG.error("filed to deploy:", ar.cause());
        return;
      }
      LOG.info("Deployed: {}", MainVerticle.class.getName());
    });
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {

    Router router = Router.router(vertx);
    router.route().failureHandler(errorContext -> {
      if (errorContext.response().ended()){
        return;
      }
      LOG.info("Route error: ", errorContext.failure());
      errorContext.response()
        .setStatusCode(500)
        .end(new JsonObject().put("message", "Something wrong :( ").toBuffer());
    });
    AssetsRestApi.attach(router);

    vertx.createHttpServer().requestHandler(router)
      .exceptionHandler(error -> LOG.info("Http error: ", error))
      .listen(8888, http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 8888");
      } else {
        startPromise.fail(http.cause());
      }
    });
  }
}
