package db.dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;

import db.bean.Customer;
import db.dao.CustomerDao;

public class JDBCImpl implements CustomerDao{
	private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void deleteCustomer(Customer cus) throws Exception {
		Connection conn = 
				DataSourceUtils.getConnection(
						dataSource);
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
			stmt.execute("delete from s_cus where id = "+cus.getId());
		//	stmt.close();
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}finally{
			if(stmt!=null){
				stmt.close();
			}
			DataSourceUtils.releaseConnection(conn, dataSource);
		}
	}

	@Override
	public void saveOrUpdateCus(Customer cus) throws Exception {
		Connection conn = 
				DataSourceUtils.getConnection(dataSource);
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
			stmt.execute("insert into s_cus values("
						+cus.getId()+",'"+cus.getName()+"')");
			throw new Exception("ceshi....");
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}finally{
			if(stmt!=null){
				stmt.close();
			}
			DataSourceUtils.releaseConnection(conn, dataSource);
		}
	}
	

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"db/dao/impl/jdbc_dao.xml");
		JDBCImpl impl = ac.getBean("dao",JDBCImpl.class);
		Customer cus = new Customer();
		cus.setId(1L);
		cus.setName("briup"+cus.getId());
		impl.saveOrUpdateCus(cus);
//		impl.deleteCustomer(cus);
	}
}
