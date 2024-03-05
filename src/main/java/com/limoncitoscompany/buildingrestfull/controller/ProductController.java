package com.limoncitoscompany.buildingrestfull.controller;

import org.springframework.web.bind.annotation.RestController;

import com.limoncitoscompany.buildingrestfull.model.Product;
import com.limoncitoscompany.buildingrestfull.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ProductController {
    @Autowired
    ProductService productService = new ProductService();
    
    @GetMapping("/products")
    public List<Product> getAllTopics() {
       return productService.getAllProducts();
    }
    @GetMapping("/products/{pId}")
    public Product getProduct(@PathVariable("pId") String id) {
        return productService.getProduct(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("products/{pId}")
    public void updateProduct(@RequestBody Product product,@PathVariable("pId") String id ) {
                productService.updateProduct(id, product);
    }

    @DeleteMapping("products/{pId}")   
    public void deleteProduct(@PathVariable("pId") String id ) {
        productService.deleteProduct(id);
    }
}
