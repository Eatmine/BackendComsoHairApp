package com.example.Cosmo.Budget.Tracker.controllers;

import com.example.Cosmo.Budget.Tracker.WebUser;
import com.example.Cosmo.Budget.Tracker.WebUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CosmoController {

    @Autowired
    private WebUserRepository webUserRepository; //webUserRepository is an instance variable that allows me to access the records in my table. WebUserRepository is the class/interface that communicates with Database/Table
//
//    @PostMapping("/add")
//    public String addCustomer(@RequestParam String first, @RequestParam String last) {
//        Customer customer = new Customer();
//        customer.setFirstName(first);
//        customer.setLastName(last);
//        customerRepository.save(customer);
//        return "Added new customer to repo!";
//    }

    @GetMapping("/users")
    public Iterable<WebUser> getWebUsers() {
        return webUserRepository.findAll();
    }
}
