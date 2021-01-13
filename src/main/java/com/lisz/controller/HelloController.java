package com.lisz.controller;

import com.lisz.entity.Numbers;
import com.lisz.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {
    @Autowired
    private Numbers numbers;

    @GetMapping("/hello")
    public String hello() {
        return "hello xiaolu!";
    }

    // 访问方式：curl -X POST -d "name1=lisz&age=10" http://localhost:8080/hello-world
    @PostMapping("/hello-world")
    public String hellowWorld(@RequestParam(name = "name1") String name, @RequestParam int age) {
        System.out.println(numbers);
        return "name: " + name + " age: " + (age + 1);
    }

    @PutMapping("/put")
    public String put (){
        return "put";
    }

    @GetMapping("/online")
    public String online(HttpSession session){
        session.setAttribute("a", "b");
        return "当前在线人数: " + MyListener.online;
    }
}
