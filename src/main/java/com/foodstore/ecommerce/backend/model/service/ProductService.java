package com.foodstore.ecommerce.backend.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodstore.ecommerce.backend.model.Product;
import com.foodstore.ecommerce.backend.model.dao.ProductDAO;

@Service
public class ProductService {

    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    
    public List<Product> geProducts() {
        return productDAO.findAll();
    }



}
