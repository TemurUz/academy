package uz.jurayev.vertx_starter;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.junit5.VertxExtension;
import io.vertx.junit5.VertxTestContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(VertxExtension.class)
public class FuturePromiseExample {

  public static final Logger LOG = LoggerFactory.getLogger(FuturePromiseExample.class);

  @Test
  void promise_success(Vertx vertx, VertxTestContext context){

    Promise<String> promise = Promise.promise();
    LOG.debug("Start");
    vertx.setPeriodic(500, id -> {
      promise.complete("success");
      LOG.debug("success");
      context.completeNow();
    });
    LOG.debug("End");
  }
  @Test
  void promise_failure(Vertx vertx, VertxTestContext context){
    Promise<String> promise = Promise.promise();
    LOG.debug("Start");
    vertx.setPeriodic(500, id -> {
      promise.fail(new RuntimeException("Failed!"));
      LOG.debug("Failed");
      context.completeNow();
    });
   LOG.debug("end");
  }
  @Test
  void future_success(Vertx vertx, VertxTestContext context){
    Promise<String> promise = Promise.promise();
    vertx.setPeriodic(500, result -> {
      LOG.debug("Start");
      promise.complete("success");
      LOG.debug("Done");
    });
    Future<String> future = promise.future();
    future.onSuccess(result -> {
      LOG.debug("result: {}", result);
      context.completeNow();
    })
      .onFailure(context::failNow);
  }

  @Test
  void future_failure(Vertx vertx, VertxTestContext context){
    Promise<String> promise = Promise.promise();
    vertx.setPeriodic(500, result -> {
      LOG.debug("Start");
      promise.fail(new RuntimeException("Failed!"));
      LOG.debug("Done");
    });
    Future<String> future = promise.future();
    future.onSuccess(result -> {
        LOG.debug("result: {}", result);
        context.completeNow();
      })
      .onFailure(error -> {
        LOG.debug("error: ", error);
        context.completeNow();
      });
  }

  @Test
  void future_map(Vertx vertx, VertxTestContext context){
    Promise<String> promise = Promise.promise();
    vertx.setPeriodic(500, result -> {
      LOG.debug("Start");
      promise.complete("success");
      LOG.debug("Done");
    });
    Future<String> future = promise.future();
    future.map(asString -> {
      LOG.debug("Return the jsonObject");
      return new JsonObject().put("key", asString);
    })
        .map(jsonObject -> new JsonArray().add(jsonObject))
        .onSuccess(result -> {
        LOG.debug("result: {} of type: {}", result, result.getClass().getName());
        context.completeNow();
      })
      .onFailure(context::failNow);
  }
  @Test
  void future_coordination(Vertx vertx, VertxTestContext context){
    vertx.createHttpServer().requestHandler(request -> LOG.debug("{}", request))
      .listen(8095)
//      .compose(server -> {
//        LOG.debug("Another task");
//        return Future.succeededFuture(server);
//      })
      .onFailure(context::failNow)
      .onSuccess(server -> {
        LOG.debug("Server started on port: {}", server.actualPort());
        context.completeNow();
      });
  }
  @Test
  void future_composition(Vertx vertx, VertxTestContext context){
    var one = Promise.promise();
    var two = Promise.promise();
    var three = Promise.promise();

    var oneFuture = one.future();
    var twoFuture = two.future();
    var threeFuture = three.future();

    CompositeFuture.all(oneFuture, twoFuture, threeFuture)
      .onSuccess(result -> {
        LOG.debug("success");
        context.completeNow();
      })
      .onFailure(context::failNow);

    vertx.setPeriodic(500, id -> {
      one.complete();
      two.complete();
      three.complete();
    });
  }
}
