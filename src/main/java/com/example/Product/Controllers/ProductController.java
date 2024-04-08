package com.example.Product.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.Models.Product;
import com.example.Product.Services.ProductService;
import com.example.Product.dtos.ExceptionDto;

//This controller is capable to host HTTPs API's
@RestController
//localhost:8080/products -> ProductController
@RequestMapping("/products")
public class ProductController {//waiter

    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        //throw new RuntimeException("Something went wrong");
//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try {
//            product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("Hello");
//            return responseEntity;
//        } catch (RuntimeException exception) {
//            ExceptionDto dto = new ExceptionDto();
//            dto.setMessage("Something went wrong");
//            ResponseEntity<ExceptionDto> response =
//                    new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
//            return response;
//        }
        return productService.getProductById(id);

    @GetMapping("")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

}
