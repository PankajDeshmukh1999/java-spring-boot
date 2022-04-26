package com.codekul.java28SeptFullStack.onetoone.controller;

import com.codekul.java28SeptFullStack.onetoone.model.Address;
import com.codekul.java28SeptFullStack.onetoone.model.User;
import com.codekul.java28SeptFullStack.onetoone.repository.AddressRepository;
import com.codekul.java28SeptFullStack.onetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("saveUser")
    public String saveUser(){
        User user = new User();
        user.setName("Rahul");
        user.setEmail("rahul@gmail.com");

        Address address = new Address();
        address.setAddress("pune");
        address.setPinCode(24354);

        user.setAddress(address);
        address.setUser(user);

        userRepository.save(user);
        addressRepository.save(address);
        return "User saved..";
    }
}
