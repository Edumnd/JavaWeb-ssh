package com.briup.proxy;

import java.lang.reflect.Proxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		UserDao dao = new UserDaoImpl2();
//		dao.addUser();
		MyHandler handler = new MyHandler();
		UserDaoImpl impl = new UserDaoImpl();//��Ҫ������Ķ���
		handler.setObj(impl);
		UserDao proxy = (UserDao)Proxy.newProxyInstance(
				impl.getClass().getClassLoader(),
				new Class[]{UserDao.class},
				handler);
//		proxy.addUser();
		impl.addUser();
		/*ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"com/briup/proxy/proxy.xml");
		UserDao dao = (UserDao)ac.getBean("daoProxy");
		dao.addUser();*/
//		UserDao dao = (UserDao)ac.getBean("dao");
//		dao.addUser();
	}
}

