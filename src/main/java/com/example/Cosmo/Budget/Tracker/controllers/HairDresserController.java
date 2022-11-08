package com.example.Cosmo.Budget.Tracker.controllers;
import com.example.Cosmo.Budget.Tracker.Models.HairDresser;
import com.example.Cosmo.Budget.Tracker.Repositories.HairDresserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class HairDresserController {

    @Autowired
    private HairDresserRepository hairDresserRepository;


    @PostMapping("/addHairDresser")
    public String addHairDresser(@RequestParam(value ="name", defaultValue = "Min") String name,
                             @RequestParam(value = "instagram", defaultValue="@they.call.me.mimii") String instagram,
                            @RequestParam(value = "website", defaultValue="www.google.com") String website

    )
    {
        HairDresser hairDresser = new HairDresser();
        hairDresser.setName(name);
        hairDresser.setInstagram(instagram);
        hairDresser.setWebsite(website);
        hairDresserRepository.save(hairDresser);
        return "Added new hairdresser to repo!";
    }

    @GetMapping("/getHairDressers")
    public Iterable<HairDresser> getHairDresser() {
        return hairDresserRepository.findAll();
    }
}
