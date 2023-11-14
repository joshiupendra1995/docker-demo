package com.uj.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome Upendra to Docker World!!!";
	}

}
