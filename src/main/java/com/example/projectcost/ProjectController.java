package com.example.projectcost;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/precalc")
    public String show() {
        return "To be updated";
    }
}
