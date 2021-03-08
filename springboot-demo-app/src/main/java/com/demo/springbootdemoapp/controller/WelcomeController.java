package com.demo.springbootdemoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("welcom")
public class WelcomeController {

	@GetMapping("/welcom")
	public String welcome() {
		return "Hey";  
	}

}
