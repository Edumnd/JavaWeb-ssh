package com.briup.bean;

public class Student {
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private Address addres;
	public Student(){
		System.out.println("Student无参构造器。。");
	}
	public Student(Long idL,String email,String name,Integer age){
		this.id = idL;
		this.name = name;
		this.age = age;
		this.email = email;
		System.out.println("Student有参构造器。。。");
	}
	
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString(){
		return id+","+name+","+age+","+email+","+addres;
	}
}
