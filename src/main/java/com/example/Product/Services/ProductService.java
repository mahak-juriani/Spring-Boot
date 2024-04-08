package com.example.Product.Services;

import java.util.List;

import com.example.Product.Models.Product;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
    
}
    

