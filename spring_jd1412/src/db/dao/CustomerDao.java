package db.dao;

import db.bean.Customer;

public interface CustomerDao {
	public void deleteCustomer(Customer cus) throws Exception;
	public void saveOrUpdateCus(Customer cus) throws Exception;
}
