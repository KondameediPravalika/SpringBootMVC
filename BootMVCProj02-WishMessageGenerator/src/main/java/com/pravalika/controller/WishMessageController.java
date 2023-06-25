package com.pravalika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pravalika.service.IWishMessageService;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService service;
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping("/wish")
	public ModelAndView wishMessageGen() {
		String message = service.generateWishMessage();
		ModelAndView mav= new ModelAndView();
		mav.addObject("wmsg",message);
		mav.setViewName("display");
		return mav;
		//return new ModelAndView("display","wmsg",message);
	}
	
	
	
}
