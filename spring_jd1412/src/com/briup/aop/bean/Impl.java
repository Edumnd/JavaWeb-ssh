package com.briup.aop.bean;

public class Impl implements UserDao {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("impl2..add User ....");
		//throw new RuntimeException("±®¥Ì’‚ÕÊ°£°£°£");
	}

	@Override
	public void taddUser() {
		// TODO Auto-generated method stub
		System.out.println("impl2..tadd User ....");
	}

	@Override
	public void tadd() {
		// TODO Auto-generated method stub
		System.out.println("impl2..tadd ....");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("impl2..deleteUser ....");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("impl2..modify ....");
	}

}
