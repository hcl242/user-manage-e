package com.hbfw.service;

import java.util.List;

import com.hbfw.pojo.User;

public interface UserService {
	
	public List<User> userList();
	
	public User userLogin(User user);
}
