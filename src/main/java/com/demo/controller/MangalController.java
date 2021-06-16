package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mangal")
public class MangalController {
	
	@GetMapping("/")
	public String greet() {
		return "hello mangal";
	}

}
