package by.smuraha.redirect;

import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class RedirectService implements SparkApplication {
    @Override
    public void init() {
        get("/", (request, response) -> "Hello World");

        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });
    }
}
