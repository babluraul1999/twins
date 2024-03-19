package com.project.service;

import org.springframework.stereotype.Service;

import com.project.entity.Product;

@Service
public interface ProductService {

	public Product createProduct(Product form);
	
	
	
}
