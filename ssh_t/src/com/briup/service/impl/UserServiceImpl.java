package com.briup.service.impl;

import com.briup.bean.User;
import com.briup.dao.UserDao;
import com.briup.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao dao;
	public void setDao(UserDao dao){
		this.dao = dao;
	}
	public void register(User user) throws RuntimeException {
		User u = 
			dao.findByName(user.getUserName());
		if(u!=null){
			throw new RuntimeException("用户名已经存在");
		}
		dao.saveOrUpdate(user);
//		throw new RuntimeException("测试");
	}

}