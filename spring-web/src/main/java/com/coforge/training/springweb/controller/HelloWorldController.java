package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 27, 2025
* Time     : 2:30:59 PM
* Project  : spring-web
*/
@Controller
public class HelloWorldController {
	/* Work Flow of Spring MVC Application
	 * 
	 *   Client --> Request(index.jsp) --> FrontController(Web.xml) 
	 *       -->Controller(HelloWorldController) ---> response(hello.jsp) 
	 * 
	 */
	@GetMapping("/shradhey") //mapping URL of the request to the method
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/noida") //mapping URL of the request to the method
	public String sayHello1() {
		return "noida";
	}

}
