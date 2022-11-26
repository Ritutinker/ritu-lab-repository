package com.LabTest.repositories;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.LabTest.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {

	
	public Product findById(int id);
	@Transactional
	int removeByPname(String pname);
	@Transactional
	Product findByPrice(Double price);
	@Transactional
	public Product findByPname(String pname);
}
