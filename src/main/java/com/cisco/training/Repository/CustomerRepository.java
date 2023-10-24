package com.cisco.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cisco.training.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	
	

}
