package com.example.service;

public class AopService  {

	private AService aService;
	private BService bService;
	
	public void setAService(AService aService) {
		this.aService = aService;
	}
	public void setBService(BService bService) {
		this.bService = bService;
	}
	
	public void test() throws Exception {
		aService.test();
		bService.test();
		//bService.error();
	}
}
