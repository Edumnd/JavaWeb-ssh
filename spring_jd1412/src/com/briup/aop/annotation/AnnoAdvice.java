package com.briup.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoAdvice {
	
	@Pointcut("execution(* com.briup.aop.bean.UserDao.*(..))")
	public void myMethod(){
		
	}
	
	@Before("execution(* com.briup.aop.bean.UserDao.*User(..))")
	public void before(){
		System.out.println("����ǰ��ǿ��������");
	}
	
	@Around("myMethod()")
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("����֮ǰ��������");
		Object result = jp.proceed();
		System.out.println("����֮�󡣡�����");
		return result;
	}
	
}
