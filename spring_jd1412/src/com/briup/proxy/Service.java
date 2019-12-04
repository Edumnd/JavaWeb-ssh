package com.briup.proxy;

import java.lang.reflect.Proxy;

public class Service {
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	public void regist(){
		dao.addUser();
	}
}
