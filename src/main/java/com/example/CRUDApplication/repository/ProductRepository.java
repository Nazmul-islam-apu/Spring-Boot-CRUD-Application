package com.example.CRUDApplication.repository;

import com.example.CRUDApplication.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
