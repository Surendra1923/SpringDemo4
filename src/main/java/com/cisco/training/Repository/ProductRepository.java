package com.cisco.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.training.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
