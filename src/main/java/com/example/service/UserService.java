package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.model.Link;
import com.example.model.Node;

public class UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public List<User> getUserList() {
		return this.userDao.getUserList();
	}
	
	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("user1");
		user.setCreateDate(new java.util.Date());
		list.add(user);
		
		return list;
	}
}
