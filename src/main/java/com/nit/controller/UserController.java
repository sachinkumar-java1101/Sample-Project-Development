package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController 
{
	@GetMapping("/")
	public String getData()
	{
		return "Hello Welcome to thr World-----!"; 
		
	}

}
