package com.codekul.java28SeptFullStack.manytomany.controller;

import com.codekul.java28SeptFullStack.manytomany.domain.Customer;
import com.codekul.java28SeptFullStack.manytomany.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){

        customerRepository.save(customer);
        return "customer saved...";
    }
}
