package com.example.crudapiarunabh.repository;

import com.example.crudapiarunabh.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
