package edu.global.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Hi!";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello~~~!";
	}
	
	@GetMapping("/home")
	public String home1() {
		return "Here is home";
	}

	
}
