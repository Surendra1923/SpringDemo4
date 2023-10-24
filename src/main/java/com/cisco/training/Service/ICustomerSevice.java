package com.cisco.training.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cisco.training.Exception.CustomerNotFoundException;
import com.cisco.training.Entity.Customer;

@Service
public interface ICustomerSevice {
	
	
	public Customer insertCustomer(Customer cust);
	
	public List<Customer> getallCustomer();
	
	public Customer getCustomer(Long custId);
	
	public void deletById(Long custId);
	
	public Customer updateCustomer(Long custId, Customer cust) throws CustomerNotFoundException;
}
