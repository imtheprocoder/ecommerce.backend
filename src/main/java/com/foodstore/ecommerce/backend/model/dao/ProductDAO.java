package com.foodstore.ecommerce.backend.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.foodstore.ecommerce.backend.model.Product;

public interface ProductDAO extends ListCrudRepository<Product, Long> {

}
