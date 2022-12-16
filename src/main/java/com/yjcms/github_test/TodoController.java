package com.yjcms.github_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String helloWorld() {

        return "To-do Application!";

    }
}
