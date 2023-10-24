package com.cisco.training.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.training.Entity.Product;
import com.cisco.training.Repository.ProductRepository;

@RestController
public class ProdcutController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@PostMapping("/insertproduct")
	public Product insertProduct(@RequestBody Product pd) {
		return productRepo.save(pd);
	}
	
	@GetMapping("/getallproduct")
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}

}
