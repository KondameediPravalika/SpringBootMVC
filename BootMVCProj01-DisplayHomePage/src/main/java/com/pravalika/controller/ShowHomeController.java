package com.pravalika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	///spring mvc
	@RequestMapping("/welcome")
	public String displayHomePage() {
		return "home";
	}
}
