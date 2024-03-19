package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto_binding.ProductForm;
import com.project.entity.Product;
import com.project.service.ProductService;

@RestController("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/create")
	public ResponseEntity<Product> createProductHanddler(@RequestBody Product form)
	{
		Product savedProduct = service.createProduct(form);
		return ResponseEntity.ok(savedProduct);
	}
}
