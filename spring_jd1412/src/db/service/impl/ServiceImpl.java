package db.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import db.bean.Customer;
import db.dao.CustomerDao;
import db.service.CustomerService;

public class ServiceImpl implements CustomerService{
	private CustomerDao dao;
	public CustomerDao getDao() {
		return dao;
	}
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	@Override
	public void regist(Customer cus) throws Exception {
		dao.deleteCustomer(cus);
//		cus.setId(cus.getId()+2);
		cus.setName("briup"+cus.getId());
		cus.setId(null);
		dao.saveOrUpdateCus(cus);
		
	}
	
	
	
	@Transactional(propagation=Propagation.REQUIRED,
					rollbackFor=Exception.class)
	public void registUser(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteCustomer(cus);
		cus.setName("briup"+cus.getId());
//		cus.setId(cus.getId()+2);
		cus.setId(null);
		dao.saveOrUpdateCus(cus);
	}
	@Override
	public void registuser(Customer cus) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteCustomer(cus);
		cus.setId(cus.getId()+1);
		cus.setName("briup"+cus.getId());
		dao.saveOrUpdateCus(cus);
	}
	public static void main(String[] args) throws Exception {
//		ClassPathXmlApplicationContext ac = 
//				new ClassPathXmlApplicationContext(
//						"db/dao/impl/jdbc_dao.xml",
//						"db/service/impl/jdbc_service.xml");
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"db/dao/impl/hibernate_dao.xml",
//						"db/service/impl/hibernate_service.xml");
						"db/service/impl/schema_service.xml");
//						"db/service/impl/an_service.xml");
		CustomerService impl = 
				ac.getBean("service",CustomerService.class);
		System.out.println(impl.getClass());
		//		CustomerService impl = 
//			(CustomerService)
//			ac.getBean("tranProxy");
		Customer cus = new Customer();
		cus.setId(9L);
		cus.setName("briup");
//		impl.regist(cus);
		impl.registUser(cus);
	}
	

}
