package com.codekul.java28SeptFullStack.onetoone.repository;

import com.codekul.java28SeptFullStack.onetoone.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
