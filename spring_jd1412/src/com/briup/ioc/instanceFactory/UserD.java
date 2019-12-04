package com.briup.ioc.instanceFactory;

import java.sql.Connection;

public class UserD {
	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
}
