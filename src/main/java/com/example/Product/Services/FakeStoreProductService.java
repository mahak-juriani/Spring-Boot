package com.example.Product.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.Models.Product;
import com.example.Product.dtos.FakeStoreProductDto;

@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(Long id){
        //Call the fakeStore Api to get the Product with the gien id.
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDto.class);

        //convert FakeStoreProductDto object to Product object.
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDecription());
        product.setImage(fakeStoreProductDto.getImage());

        return product;
    }
}
