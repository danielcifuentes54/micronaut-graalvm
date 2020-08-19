package micronaut.graalvm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import micronaut.graalvm.api.dto.Greeting;

@Controller("/api/v1/micronaut")
public class HelloController {

    @Get(value = "/hello", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Greeting> hello() {
        Greeting greeting = new Greeting();
        greeting.setAction("Hello!!!");
        return HttpResponse.ok(greeting);
    }
}
