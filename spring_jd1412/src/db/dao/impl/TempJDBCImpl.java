package db.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import db.bean.Customer;
import db.dao.CustomerDao;

public class TempJDBCImpl extends JdbcDaoSupport implements CustomerDao{
	@Override
	public void deleteCustomer(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().execute("delete from s_cus where id = "+cus.getId());
	}

	@Override
	public void saveOrUpdateCus(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("insert into s_cus values (?,?)", cus.getId(),cus.getName());
	}
	
	public void findAll() throws Exception{
		String sql = "select * from s_cus";
		List<Customer> cuss = 
				this.getJdbcTemplate().query(sql, new RowMapper<Customer>(){

					@Override
					public Customer mapRow(ResultSet arg0, int arg1)
							throws SQLException {
						Customer cus = new Customer();
						cus.setId(arg0.getLong("id"));
						cus.setName(arg0.getString("name"));
						return cus;
					}
					
				});
		for(Customer cus:cuss){
			System.out.println(cus.getId()+","+cus.getName());
		}
	}

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"db/dao/impl/tempjdbc_dao.xml");
		TempJDBCImpl impl = ac.getBean("dao",TempJDBCImpl.class);
		Customer cus = new Customer();
		cus.setId(1L);
		cus.setName("briup1");
//		impl.saveOrUpdateCus(cus);
		impl.findAll();
	}
}
