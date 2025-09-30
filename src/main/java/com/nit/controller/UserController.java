package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	@GetMapping("/")
	public String getData()
	{
		return "Hello Welcome to the Sachin World-----!"; 
		
	}

}
