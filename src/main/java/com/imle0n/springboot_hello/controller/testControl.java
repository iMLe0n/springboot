package com.imle0n.springboot_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class testControl {
    @GetMapping("/user/{id}")
    public String findById(@PathVariable Long id) {
        return id.toString();
    }
}

