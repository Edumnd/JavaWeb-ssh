package db.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

import db.bean.Customer;
import db.dao.CustomerDao;

public class HibernateImpl implements CustomerDao{
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void deleteCustomer(Customer cus) throws Exception {
		Session session = 
				SessionFactoryUtils.getSession(sessionFactory, true);
		session.delete(cus);
		SessionFactoryUtils.releaseSession(session, sessionFactory);
	}

	@Override
	public void saveOrUpdateCus(Customer cus) throws Exception {
		Session session = 
				SessionFactoryUtils.getSession(sessionFactory, true);
//		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(cus);
//		tran.commit();
		SessionFactoryUtils.releaseSession(session, sessionFactory);
	}

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"db/dao/impl/hibernate_dao.xml");
		HibernateImpl impl = (HibernateImpl)ac.getBean("dao");
		Customer cus = new Customer();
		cus.setName("briupxx");
		impl.saveOrUpdateCus(cus);
	}
}
