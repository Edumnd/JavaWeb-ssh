package com.briup.bean;

public class Teacher {
	private long id;
	private String name;
	private Student stu;
	public Teacher(){
		System.out.println("Teacher被构建。。。");
	}
	public Teacher(long id,String name,Student stu){
		this.id = id;
		this.name = name;
		this.stu = stu;
		System.out.println("Teacher对象有参构建。。");
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void post_consturct(){
		System.out.println("初始化完成。。");
	}
	public void pre_destory(){
		System.out.println("teavher销毁。。。");
	}
	
	public String toString(){
		return super.toString()+",id:"+id+",name:"+name;
	}
}
