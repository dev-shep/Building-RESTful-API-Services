package com.limoncitoscompany.buildingrestfull;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.limoncitoscompany.buildingrestfull.model.Product;

@Service
public class ProductService {
    private List<Product> products = Arrays.asList(
        new Product("p101","Monitor","Electronics"),
        new Product("p102","Monitor","Electronics"),
        new Product("p103","Monitor","Electronics"),
        new Product("p104","Monitor","Electronics"),
        new Product("p105","Monitor","Electronics"),
        new Product("p106","Monitor","Electronics"));
  
    public List<Product> getAllProducts() {
        return products;
    }
}
