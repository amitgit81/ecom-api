package com.raj.ecom_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.ecom_api.model.Product;
import com.raj.ecom_api.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public String setProduct(Product product) {
        repo.save(product);
        return "Product Added";
    }

    public String setProducts(List<Product> products) {
        repo.saveAll(products);
        return "Products Added";
    }

    public String updateProduct(int id, Product product) {
        if (repo.existsById(id)) {
            repo.save(product);
            return "Product Updated";
        }
        return "Product id not found";
    }

    public String deleteProduct(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Product Deleted";
        }
        return "Product id not found";
    }

}
