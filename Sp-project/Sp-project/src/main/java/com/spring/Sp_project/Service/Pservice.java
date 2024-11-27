package com.spring.Sp_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Sp_project.Model.Product;
import com.spring.Sp_project.Repository.PRepo;

@Service
public class Pservice {
	
	private PRepo repo;
	
	private Product prod;
	
	@Autowired
	public Pservice(PRepo repo) {
		this.repo = repo;
	}

	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public void addProduct(Product prod) {
		// product.add(prod);
		repo.save(prod);
	}
	
	public void updateProduct(Product prod) {
		repo.save(prod);
	}

}
