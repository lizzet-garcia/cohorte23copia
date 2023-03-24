package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundo {
	@RequestMapping("/")
	public String holaMundo() {
		return "Hola mundo desde Spring Boot";
	}

}
