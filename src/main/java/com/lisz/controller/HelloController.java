package com.lisz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello xiaolu!";
    }

    @PostMapping("/hello-world")
    public String hellowWorld(@RequestParam(name = "name1") String name, @RequestParam int age) {
        return "name: " + name + " age: " + (age + 1);
    }

    @PutMapping("/put")
    public String put (){
        return "put";
    }
}
