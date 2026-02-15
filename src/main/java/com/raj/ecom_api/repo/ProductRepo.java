package com.raj.ecom_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.ecom_api.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
