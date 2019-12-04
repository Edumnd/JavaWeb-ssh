package com.briup.dao;

import com.briup.bean.User;

public interface UserDao {
	public void saveOrUpdate(User user)throws RuntimeException;
	public User findByName(String name)throws RuntimeException;
}
