package com.briup.ioc.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactory 
implements FactoryBean{
	/*private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "briup";
	private String password = "briup";*/
	private String driver ;
	private String url;
	private String username ;
	private String password ;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Object getObject() throws Exception {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
