package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.bean.UserDao;

public class Spring_aop_test {
	
	@Test
	public void auto_proxy(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/aop/throwA/throwA.xml");
		UserDao dao = (UserDao)ac.getBean("target");
		System.out.println(dao.getClass());
	}
	
	@Test
	public void advisor_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/aop/advisor/advisor.xml");
		UserDao dao = (UserDao)ac.getBean("target");
		dao.addUser();
		dao.modify();
	}
	
	@Test
	public void before_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/aop/throwA/throwNew.xml");
		UserDao dao = (UserDao)ac.getBean("proxy");
		dao.addUser();
		dao.deleteUser();
		dao.modify();
		dao.tadd();
	}
//	@Test
//	public void before_test(){
//		ApplicationContext ac = 
//				new ClassPathXmlApplicationContext(
//				"com/briup/aop/before/before.xml");
//		UserDao dao = (UserDao)ac.getBean("proxy");
//		dao.addUser();
//	}
}
