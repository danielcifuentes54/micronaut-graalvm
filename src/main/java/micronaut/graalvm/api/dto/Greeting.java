package micronaut.graalvm.api.dto;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Greeting {

    private String action;

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
