package uz.jurayev.vertx;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.jurayev.vertx.data.Assets;

public class AssetsRestApi {

  public static final Logger LOG = LoggerFactory.getLogger(AssetsRestApi.class);
  public static void attach(Router route){

  route.get("/assets").handler(routingContext -> {
    final JsonArray response = new JsonArray();
    response
      .add(new Assets("id"))
      .add(new Assets("name"))
      .add(new Assets("surname"))
      .add(new Assets("email"));
        LOG.info("Path: {} response with: {}", routingContext.normalizedPath(), response);
        routingContext.response().end(response.toBuffer());
  });

  }
}
