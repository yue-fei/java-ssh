package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAop {

	public void doBefore(JoinPoint jp) {
		System.out.println("do before...");
	}
	
	public void doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("do around...");
		pjp.proceed();
	}
	
	public void doAfter(JoinPoint jp) {
		System.out.println("do after...");
	}
	
	public void doThrowing(JoinPoint jp, Throwable ex) {
		System.out.println("throwing...");
	}
}
