package com.prudential.assignment.CarRental.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@RequestMapping("/test")
	public String testMethod() {
		return "test successful.";
	}
	@RequestMapping("/test1")
	public List<String> testMethod1() {
		return Arrays.asList("Anupama","Dubey");
	}

}
