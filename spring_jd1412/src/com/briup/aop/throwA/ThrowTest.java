package com.briup.aop.throwA;

import org.springframework.aop.ThrowsAdvice;

public class ThrowTest implements ThrowsAdvice{
	public void afterThrowing(Exception ex){
		System.out.println("......∑¢…˙“Ï≥£:"+ex.getMessage());
	}
}
