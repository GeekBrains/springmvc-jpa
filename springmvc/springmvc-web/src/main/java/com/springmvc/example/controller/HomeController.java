package com.springmvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/index", method={RequestMethod.GET,RequestMethod.POST})
	public String sayHelloToWorld(){
		return "index";
	}
}
