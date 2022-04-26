package com.codekul.java28SeptFullStack.manytomany.repository;

import com.codekul.java28SeptFullStack.manytomany.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
