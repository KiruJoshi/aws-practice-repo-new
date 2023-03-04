package com.example.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAwsController {
	
	@GetMapping("/getDetails")
	public String getMessage() {
		
		return "hello from Aws Service";
	}

}
