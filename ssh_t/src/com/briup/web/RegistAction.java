package com.briup.web;

import java.util.Date;

import com.briup.bean.User;
import com.briup.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport{
	private String username;
	private boolean gender;
	private int age;
	private Date birthday;
	//�������service�����service.xml�ļ������õ�service���������һ��
	//ͬʱ������л���service�ṩ��get/set����
	//��ôspring�����е�ʱ��ͻ��Զ��İ�service�Ķ���ע�뵽���������
	private UserService service;
	
	public String execute(){
		User user = new User();
		user.setUserName(username);
		user.setAge(age);
		user.setBirthDate(birthday);
		user.setGender(gender);
		try{
			System.out.println("age:"+age);
			System.out.println("name:"+username);
			System.out.println("birthday:"+birthday);
			System.out.println("gender:"+gender);
			System.out.println("this = "+this.getClass());
			System.out.println(user);
			System.out.println(service);
			System.out.println("service.getClass() : "+service.getClass());
			service.register(user);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "error";
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
