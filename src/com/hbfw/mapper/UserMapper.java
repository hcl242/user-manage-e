package com.hbfw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hbfw.pojo.User;

public interface UserMapper {
	
	public List<User> userList();
	
	public User userLogin(@Param("user") User user);
}
