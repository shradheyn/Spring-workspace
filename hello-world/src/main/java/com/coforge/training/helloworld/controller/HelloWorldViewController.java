package com.coforge.training.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 29, 2025
* Time     : 3:09:29 PM
* Project  : hello-world
*/
@Controller
public class HelloWorldViewController {
	@GetMapping("/shrey")
	public String getMethodName(Model m) {
		
		m.addAttribute("name", "shrey naudiyal");
		m.addAttribute("city", "mumbai");
		m.addAttribute("country", "india");
		m.addAttribute("hello", "hello from dpring boot using jsp views");
		
		return "welcome";

	}
	
	
}
