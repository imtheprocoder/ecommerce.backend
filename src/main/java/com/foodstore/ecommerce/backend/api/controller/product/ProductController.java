package com.foodstore.ecommerce.backend.api.controller.product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodstore.ecommerce.backend.model.Product;
import com.foodstore.ecommerce.backend.model.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    


    public ProductController(ProductService productService) {
        this.productService = productService;
    }




    @GetMapping
    public List<Product> getProducts() {
        return productService.geProducts();
    }


}
