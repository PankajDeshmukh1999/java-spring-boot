package com.codekul.java28SeptFullStack.manytomany.repository;

import com.codekul.java28SeptFullStack.manytomany.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
