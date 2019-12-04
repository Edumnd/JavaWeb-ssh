package com.briup.ioc.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
					"com/briup/ioc/annotation/an.xml");
		DestBean db = (DestBean)ac.getBean("destBean");
		System.out.println(db.getSrcBean());
	}
}
