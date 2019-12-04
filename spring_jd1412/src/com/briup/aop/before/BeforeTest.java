package com.briup.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.briup.aop.bean.Logger;

//前置通知(前置增强（advice）)
public class BeforeTest implements MethodBeforeAdvice{
	Logger logger = new Logger();
	
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
	//	System.out.println(method.getName()+" is execute ... ");
		logger.logger(
			method.getName()+" is execute ...");
	}
	
}
