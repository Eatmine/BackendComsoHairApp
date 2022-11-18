package com.example.Cosmo.Budget.Tracker.controllers;
import com.example.Cosmo.Budget.Tracker.Models.HairDresser;
import com.example.Cosmo.Budget.Tracker.Repositories.HairDresserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController

public class HairDresserController {

    @Autowired
    private HairDresserRepository hairDresserRepository;


    @PostMapping("/addHairDresser")
    public HairDresser addHairDresser( @Valid @RequestBody HairDresser hairDresser)
    {return hairDresserRepository.save(hairDresser);}

    @GetMapping("/getHairDressers")
    public Iterable<HairDresser> getHairDresser() {
        return hairDresserRepository.findAll();
    }
}
