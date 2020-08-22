package com.hbfw.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbfw.pojo.User;
import com.hbfw.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	@ResponseBody
	public String login(User user,HttpSession session) {
		User userLogin = userService.userLogin(user);
		if(userLogin!=null) {
			session.setAttribute("currUser", userLogin);
			session.setMaxInactiveInterval(60*30);
			return "success!";
		}
		return "fail!";
	}
}
