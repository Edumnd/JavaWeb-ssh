package db.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import db.bean.Customer;
import db.dao.CustomerDao;

public class TempHibernateImpl extends HibernateDaoSupport implements CustomerDao{
	@Override
	public void deleteCustomer(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(cus);
	}

	@Override
	public void saveOrUpdateCus(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(cus);
	}
	
	public void findAll() throws Exception{
		List<Customer> cuss = 
				this.getHibernateTemplate().find("from Customer");
		for(Customer cus:cuss){
			System.out.println(cus.getId()+","+cus.getName());
		}
	}

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"db/dao/impl/temphibernate_dao.xml");
		TempHibernateImpl impl = ac.getBean("dao",TempHibernateImpl.class);
		Customer cus = new Customer();
//		cus.setId(1L);
		cus.setName("briup1");
		impl.saveOrUpdateCus(cus);
//		impl.findAll();
	}
}
