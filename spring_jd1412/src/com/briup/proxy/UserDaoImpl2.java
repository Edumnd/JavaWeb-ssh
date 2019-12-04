package com.briup.proxy;


public class UserDaoImpl2 implements UserDao {
	UserDaoImpl dao = new UserDaoImpl();
	@Override
	public void addUser() {
		System.out.println("before ... addUser");
		dao.addUser();
		System.out.println("after .... addUser ...");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub

	}

}
