package com.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Serializable>{

}
