package com.xyqhit.logistics.aop;

import java.lang.reflect.Method;

import org.apache.shiro.authz.Permission;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

public class LogAop {
	
	public void before(JoinPoint pjp) {
		System.out.println("动态代理之前");

	}

	
	
	public void afterthrowing(JoinPoint pjp) {
		System.out.println("动态代理抛出异常以后");

	}

}
