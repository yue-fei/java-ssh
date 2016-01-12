package com.example.service;

public class BService {

	public void test() {
		System.out.println("hello B");
	}
	
	public void error() throws Exception {
		throw new Exception("error");
	}
}
