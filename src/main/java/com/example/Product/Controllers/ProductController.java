package com.example.Product.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.Models.Product;
import com.example.Product.Services.FakeStoreProductService;
import com.example.Product.dtos.FakeStoreProductDto;

//This controller is capable to host HTTPs API's
@RestController
//localhost:8080/products -> ProductController
@RequestMapping("/products")
public class ProductController {//waiter

    private FakeStoreProductService fakeStoreProductService;

    ProductController(FakeStoreProductService fakeStoreProductService){
        this.fakeStoreProductService = fakeStoreProductService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return fakeStoreProductService.getProductById(id);
    }
}
