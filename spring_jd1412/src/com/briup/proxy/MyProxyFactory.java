package com.briup.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;

public class MyProxyFactory implements FactoryBean{
	private Object target;//被代理的对象
	private Class[] interfaces;//代理类需要实现的所有接口
	private InvocationHandler handler;//代理类需要哦执行的处理程序
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Class[] getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(Class[] interfaces) {
		this.interfaces = interfaces;
	}

	public InvocationHandler getHandler() {
		return handler;
	}

	public void setHandler(InvocationHandler handler) {
		this.handler = handler;
	}

	@Override
	public Object getObject() throws Exception {
		Object obj = Proxy.newProxyInstance(target.getClass().getClassLoader(),
				interfaces, handler);
		return obj;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
