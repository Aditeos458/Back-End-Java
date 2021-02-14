package com.example.mobilspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("nama")
	public String nama() {
		return "Helo";
	}
}
