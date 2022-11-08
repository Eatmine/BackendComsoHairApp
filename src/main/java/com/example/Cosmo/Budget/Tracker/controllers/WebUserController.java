package com.example.Cosmo.Budget.Tracker.controllers;

//import com.example.Cosmo.Budget.Tracker.StyleType;
import com.example.Cosmo.Budget.Tracker.Models.WebUser;
import com.example.Cosmo.Budget.Tracker.Repositories.WebUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class WebUserController {
    //webUserRepository is an instance variable that allows me to access the records in my table.
    // WebUserRepository is the class/interface that communicates with Database/Table
    @Autowired
    private WebUserRepository webUserRepository;

    @PostMapping("/addUsers")
    public String addWebUser(@RequestParam(value ="email", defaultValue = "user1") String email,
                             @RequestParam(value = "pass", defaultValue="Rihanna") String pass,
//                             @RequestParam(value = "20.00", defaultValue = "50.00")
                             Double hairBudget,
                             Double appointmentBudget,
                             @RequestParam(value = "hairstyleType", defaultValue="weave")String hairstyleType,
                             @RequestParam(value = "city", defaultValue="Tampa")String city
    )
    {
        WebUser webUser = new WebUser();
        webUser.setUsername(email);
        webUser.setPassword(pass);
        webUser.setCity(city);
        webUser.setHairBudget(hairBudget);
        webUser.setAppointmentBudget(appointmentBudget);
        webUser.setHairstyle(hairstyleType);
//        webUser.setStyleType(styleType);
        webUserRepository.save(webUser);
        return "Added new users to repo!";
    }



    @GetMapping("/getUsers")
    public Iterable<WebUser> getWebUser() {
        return webUserRepository.findAll();
    }
}
