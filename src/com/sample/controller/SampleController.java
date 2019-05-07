package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.model.User;
import com.sample.service.SampleService;

@Controller
public class SampleController {
	@Autowired
	private SampleService sampleService;
	@RequestMapping(value =  "/home")
	public String toHome() {
		return "home";
	}
	@RequestMapping("/register")
	public String register(@ModelAttribute User user) {
		sampleService.register(user);
		return "home";
	}
	@RequestMapping("/login")
	public String login(@ModelAttribute User user) {
		User user2 = sampleService.login(user);
		if (user2 == null) {
			return "home";
		}
		return "display";
	}
}
