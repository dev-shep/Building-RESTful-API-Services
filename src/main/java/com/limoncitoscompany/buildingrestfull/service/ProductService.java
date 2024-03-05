package com.limoncitoscompany.buildingrestfull.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.limoncitoscompany.buildingrestfull.model.Product;

@Service
public class ProductService {
    /*
    El problema que estás experimentando se debe a que estás utilizando Arrays.asList, 
    que devuelve una lista fija que no admite operaciones de modificación como agregar 
    o quitar elementos. Por lo tanto, no puedes agregar nuevos elementos a esta lista.
    private List<Product> products = Arrays.asList(
        new Product("p101","Monitor","Electronics"),
        new Product("p102","Monitor","Electronics"),
        new Product("p103","Monitor","Electronics"),
        new Product("p104","Monitor","Electronics"),
        new Product("p105","Monitor","Electronics"),
        new Product("p106","Monitor","Electronics"));
     */


    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("p101","Monitor","Electronics"),
            new Product("p102","Monitor","Electronics"),
            new Product("p103","Monitor","Electronics"),
            new Product("p104","Monitor","Electronics"),
            new Product("p105","Monitor","Electronics"),
            new Product("p106","Monitor","Electronics")));


    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(String id, Product product){
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if(p.getId().equals(id)){
                products.set(i,product);
            }
        }
    }

    public void deleteProduct(String id){
            products.removeIf(p->p.getId().equals(id));
    }
}
