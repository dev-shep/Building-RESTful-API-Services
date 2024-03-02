package com.limoncitoscompany.buildingrestfull.controller;

import org.springframework.web.bind.annotation.RestController;

import com.limoncitoscompany.buildingrestfull.ProductService;
import com.limoncitoscompany.buildingrestfull.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService = new ProductService();
    
    @GetMapping("/products")
    public List<Product> getAllTopics() {
       return productService.getAllProducts();
    }

/*     public Product getProduct(String id){
        return products.stream().filter(p -> p.getId().equals(id).findFirst().get());
    }
   */ 
}
