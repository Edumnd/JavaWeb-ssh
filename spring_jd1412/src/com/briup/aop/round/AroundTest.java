package com.briup.aop.round;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundTest implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("before " + arg0.getMethod().getName()+" execute ... ");
		Object result = arg0.proceed();//对目标方法的调用
		System.out.println("after " + arg0.getMethod().getName()+" execute ... ");
		return result;
	}

}
