package com.hbfw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbfw.pojo.User;
import com.hbfw.service.UserService;

@Controller
public class RouterController {

	@Autowired
	UserService userService;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		List<User> userList = userService.userList();
		model.addAttribute("userList", userList);
		model.addAttribute("hello", "hello spring5");
		return "hello";
	}
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		return "hi spring5";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
}
