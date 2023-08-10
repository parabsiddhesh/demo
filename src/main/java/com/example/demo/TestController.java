package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String getDemo() {
		return "Application is started";
	}

	@GetMapping("/hello/three")
	public String getDemo() {
		return "Application is started - three";
	}

}
