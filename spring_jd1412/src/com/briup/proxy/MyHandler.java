package com.briup.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println(method.getName()+"ִ��֮ǰ������");
		Object result = null;
		try{
			result = method.invoke(obj, args);
		}catch(Exception e){
//			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println("...."+e.getMessage());
//			System.out.println("�����쳣������"+e);
		}
		System.out.println(method.getName()+"ִ��֮�󡣡�����");
		return result;
	}
	
}
