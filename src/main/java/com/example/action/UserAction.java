package com.example.action;

import java.util.Map;

import java.util.HashMap;
import com.opensymphony.xwork2.ActionSupport;
import com.example.service.UserService;
import com.example.service.AopService;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	private AopService aopService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setAopService(AopService aopService) {
		this.aopService = aopService;
	}

	private Map<String, Object> data;
	
	public Map<String, Object> getData() {
		return data;
	}
	
	// aop test
	public String execute() throws Exception {
		aopService.test();
		return SUCCESS;
	}
	
	public String error() {
		return ERROR;
	}
	
	// json return
	public String json() {
		data = new HashMap<String, Object>();
		data.put("users", userService.getUsers());
		return SUCCESS;
	}
}
