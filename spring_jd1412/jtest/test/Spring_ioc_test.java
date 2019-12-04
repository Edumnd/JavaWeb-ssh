package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Student;
import com.briup.bean.Teacher;
import com.briup.ioc.annotation.DestBean;
import com.briup.ioc.coll.CollTest;
import com.briup.ioc.instanceFactory.UserD;

public class Spring_ioc_test {
	
	@Test
	public void an_test(){
		try{
			ClassPathXmlApplicationContext ac = 
					new ClassPathXmlApplicationContext(
					"com/briup/ioc/annotation/an.xml");
			DestBean s1 = ac.getBean("destBean",DestBean.class);
			System.out.println(s1.getSrcBean());
			ac.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void autowire_test(){
		try{
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/ioc/autowire/autowire.xml");
		Object s1 = ac.getBean("stu");
		System.out.println(s1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void extends_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/ioc/extens/ex.xml");
		Object s1 = ac.getBean("s1");
		System.out.println(s1);
		Object s2 = ac.getBean("s2");
		System.out.println(s2);
		Object s3 = ac.getBean("s3");
		System.out.println(s3);
	}
	
	@Test
	public void factoryBean_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/ioc/factory/factory.xml");
		Object s = ac.getBean("conn");
		System.out.println(s);
	}
	@Test
	public void staticFactory_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"com/briup/ioc/statcFactory/staticFactory.xml");
		Object s = ac.getBean("conn");
		System.out.println(s);
	}
	@Test
	public void instanceFactory_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/ioc/instanceFactory/instance.xml");
		UserD s = ac.getBean("userD",UserD.class);
		System.out.println(s.getConn());
	}
	@Test
	public void editor_test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
				"com/briup/ioc/proEditor/proEditor.xml");
		Student s = ac.getBean("stu1",Student.class);
		System.out.println(s.getAddres());
	}
	
	@Test
	public void ioc_coll_test(){
			ClassPathXmlApplicationContext ac = 
					new ClassPathXmlApplicationContext(
//					"com/briup/ioc/coll/coll.xml");
					"com/briup/ioc/coll/uitl_coll.xml");
			CollTest ct = 
					ac.getBean("c1,c2",CollTest.class);
			//System.out.println(ct.getArrys()[0]);
			System.out.println(ac.getBean("str"));
			System.out.println(ct.getList());
			System.out.println(ct.getSet().getClass());
			System.out.println(ct.getMap().getClass());
			System.out.println(ct.getProps());
		}
	@Test
	public void ioc_constructor_test(){
		try{
			ClassPathXmlApplicationContext ac = 
					new ClassPathXmlApplicationContext(
						"com/briup/ioc/constructor/constructor.xml");
			Teacher t = ac.getBean("tea",Teacher.class);
			System.out.println(t);
			Teacher t1 = ac.getBean("tea",Teacher.class);
			System.out.println(t1);
			Teacher t2 = ac.getBean("tea",Teacher.class);
			System.out.println(t2);
//			Student stu = 
//					ac.getBean("stu",Student.class);
//			System.out.println(stu.getId()+","+stu.getEmail()+","+stu.getName());
			ac.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void ioc_setter_test(){
		try{
			//实例化Spring容器
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
					"com/briup/ioc/set/set.xml");
		//getBean(Class):按照指定类型查找spring容器中的Bean对象
		//如果有多个类型匹配的bean对象存在，throws Exception;
//		Student stu = ac.getBean(Student.class);
//		System.out.println(stu+",id:"+stu.getId());
//		Student s2 = (Student)ac.getBean("stu");
//		System.out.println(s2+",name"+s2.getName());
//		Student s3 = (Student)ac.getBean("stu");
//		System.out.println(s3+",name"+s3.getName());
//		Student stu = 
//				ac.getBean("stu", Student.class);
//		System.out.println(stu+",id:"+stu.getId());
//		Teacher t1 = ac.getBean("tea",Teacher.class);
//		System.out.println(t1.getStu());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void test(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"com/briup/ioc/ioc.xml");
		Object obj = ac.getBean("tea");
		System.out.println(obj);
	}
}
