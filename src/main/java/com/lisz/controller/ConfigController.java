package com.lisz.controller;

import com.lisz.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	@Autowired
	private Person person;

	@GetMapping("/config")
	public Person getConfig(){
		return person;
	}
}
