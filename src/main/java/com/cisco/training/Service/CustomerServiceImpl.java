package com.cisco.training.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.training.Entity.Customer;
import com.cisco.training.Exception.CustomerNotFoundException;
import com.cisco.training.Repository.CustomerRepository;
@Service
public class CustomerServiceImpl  implements ICustomerSevice {
	
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public Customer insertCustomer(Customer cust) {
		
		return custRepo.save(cust);
	}

	@Override
	public List<Customer> getallCustomer() {
		
		return custRepo.findAll();
	}

	@Override
	public Customer getCustomer(Long custId) {
		
		return custRepo.findById(custId).get();
	}

	@Override
	public void deletById(Long custId) {
		custRepo.deleteById(custId);
		
	}

	@Override
	public Customer updateCustomer(Long custId, Customer cust) throws CustomerNotFoundException {
		
		
		Customer existingcust= custRepo.findById(custId).get();
		if( cust!=null) {
			
			existingcust.setCustEmail(cust.getCustEmail());
			existingcust.setCustId(cust.getCustId());
			existingcust.setCustName(cust.getCustName());
			custRepo.save(existingcust);
			
		}
		else {
			throw new CustomerNotFoundException("Customer not found");
		}
		return existingcust;
	}

}
