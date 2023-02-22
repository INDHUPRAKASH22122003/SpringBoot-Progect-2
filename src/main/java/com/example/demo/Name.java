package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Name {
		@GetMapping("/Welcome")
	public String getName()
	{
			String name="IamNeo" ;
			return "Welcome "+name+"!";
	}
}
