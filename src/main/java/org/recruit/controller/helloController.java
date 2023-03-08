package org.recruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class helloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String anotation(Model model) {
		
		model.addAttribute("hello", "hello");
		
		return "home";
	}

}
