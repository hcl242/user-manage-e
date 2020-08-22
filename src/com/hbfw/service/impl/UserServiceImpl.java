package com.hbfw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbfw.mapper.UserMapper;
import com.hbfw.pojo.User;
import com.hbfw.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> userList() {
		return userMapper.userList();
	}

	@Override
	public User userLogin(User user) {
		return userMapper.userLogin(user);
	}

}
