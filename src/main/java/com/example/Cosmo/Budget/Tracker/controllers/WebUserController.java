package com.example.Cosmo.Budget.Tracker.controllers;

//import com.example.Cosmo.Budget.Tracker.StyleType;
import com.example.Cosmo.Budget.Tracker.Models.WebUser;
import com.example.Cosmo.Budget.Tracker.Repositories.WebUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController

public class WebUserController {
    //webUserRepository is an instance variable that allows me to access the records in my table.
    // WebUserRepository is the class/interface that communicates with Database/Table
    @Autowired
    private WebUserRepository webUserRepository;

    @PostMapping("/addUsers")
    public WebUser addWebUser( @Valid @RequestBody WebUser webUser)
    {return webUserRepository.save(webUser);}

    @GetMapping("/getUsers")
    public Iterable<WebUser> getWebUsers() {
        return webUserRepository.findAll();
    }

    // optional is used because if there isn't a user with that id then the return type is null as an option
    @GetMapping("/getUsers/{id}")
    public Optional<WebUser> getWebUser(@PathVariable  Long id) {
        return webUserRepository.findById(id);
    }
}
