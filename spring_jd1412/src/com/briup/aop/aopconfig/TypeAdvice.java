package com.briup.aop.aopconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TypeAdvice {
	
	public void before(JoinPoint jp){
		System.out.println("before ...... "+jp.getSignature().getName());
	}
	/*public void before(){
		System.out.println("before  method execute");
	}*/
	
	public void after(JoinPoint jp){
		System.out.println("after ...... ");
	}
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("before around....");
		Object obj = pjp.proceed();
		System.out.println("after around....");
		return obj;
	}
	public void throwingTest(JoinPoint p,Exception ex){
		System.out.println(p.getSignature().getName()+" is throwing..."+ex.getMessage());
	}
}
