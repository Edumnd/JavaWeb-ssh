package com.briup.aop.after;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;


public class AfterTest implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println(method.getName()+" execute over !!! ");
	}

}
