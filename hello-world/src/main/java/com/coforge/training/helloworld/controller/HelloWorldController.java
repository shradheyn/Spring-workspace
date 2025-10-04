package com.coforge.training.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.helloworld.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 29, 2025
* Time     : 2:36:01 PM
* Project  : hello-world
*/

@RestController
public class HelloWorldController {
	//open browser---- http://localhost:8080/myweb/
	@GetMapping("/")
	public String sayHello() {
		return "hello world from spring boot!😍😊😂😘";
	}
	
	//open browser---- http://localhost:8080/myweb/test
	@GetMapping("/test")
	public String getTest() {
		return "She sells sea shell in the sea.";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		Employee e1=new Employee(101,"James","Gosling","james@sun.com");
		Employee e2=new Employee(102,"Rod","Jhonson","rod@spring.com");
		Employee e3=new Employee(103,"Gavin","King","king@sun.com");
		Employee e4=new Employee(104,"Shrey","King","shrey@sun.com");
		Employee e5=new Employee(105,"Gabriel","Klien","gabby@spring.com");
		
		List<Employee> empList= new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		return  empList;
	}
	
	
	
}
