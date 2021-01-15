package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringbootController {

	@GetMapping("/hello-springboot")
	public String helloSpringboot() {
		System.out.println("1");
		return "hello-springboot";
	}

	@GetMapping("/login")
	public String login(){
		return "login";
	}
}
