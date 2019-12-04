package com.briup.ioc.statcFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class StaticFactory {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "briup";
	private static String password = "briup";

	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
