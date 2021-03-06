package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    //@Value("${welcome.message}")
    private String msg;

    @GetMapping("/")
    public String sayHello() {
        return this.msg;
    }
    public WelcomeController (@Value("${welcome.message}") String message) {
        this.msg = message;

    }
}
