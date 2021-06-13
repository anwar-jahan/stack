package com.aj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class UtilityController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}

}
