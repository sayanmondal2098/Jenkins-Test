package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.*;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello()   
	{  
	return "Hello World , Today date is : " + LocalDate.now();  
	}  
	
}
