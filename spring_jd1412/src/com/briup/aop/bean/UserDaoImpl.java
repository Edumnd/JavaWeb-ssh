package com.briup.aop.bean;

import javax.sql.DataSource;

public class UserDaoImpl implements UserDao {
//	private DataSource dataSource;
//	public DataSource getDataSource() {
//		return dataSource;
//	}
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("addUser ......");
//		throw new RuntimeException("add User Exception£¡£¡");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("deleteUser ...... ");
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("modify user.....");
	}

	@Override
	public void taddUser() {
		// TODO Auto-generated method stub
		System.out.println("taddUser......");
	}

	@Override
	public void tadd() {
		// TODO Auto-generated method stub
		System.out.println("tadd·½·¨¡£¡£¡£¡£");
	}

}
