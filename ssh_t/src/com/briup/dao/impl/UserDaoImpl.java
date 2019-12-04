package com.briup.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.briup.bean.User;
import com.briup.dao.UserDao;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate temp;

	public User findByName(String name) throws RuntimeException {
		List<User> list = 
			temp.find("from User where name = ?",name);
		
		
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	public void saveOrUpdate(User user) throws RuntimeException {
		temp.saveOrUpdate(user);
	}
	
	public HibernateTemplate getTemp() {
		return temp;
	}

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}

}
