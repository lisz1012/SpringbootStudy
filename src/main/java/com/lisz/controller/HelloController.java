package com.lisz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello xiaolu!";
    }

    @PostMapping("/hello-world")
    public String hellowWorld() {
        return "hellow world!";
    }

    @PutMapping("/put")
    public String put (){
        return "put";
    }
}
