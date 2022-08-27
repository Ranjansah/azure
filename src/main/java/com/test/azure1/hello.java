package com.test.azure1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@GetMapping("/hi")
	public String hi()

	{
		return "hi ";
	}
}
