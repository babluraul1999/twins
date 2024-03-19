package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Product;
import com.project.repository.ProductRepository;


@Service
public class ProductServiceimpl  implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public Product createProduct(Product form) {
		Product saveEntity = repository.save(form);
		return form;
	}

}
