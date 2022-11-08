package com.example.Cosmo.Budget.Tracker.Models;

import javax.persistence.*;

@Entity
public class HairDresser {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String instagram;
    private String website;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public HairDresser(String name, String instagram, String website) {
        this.name = name;
        this.instagram = instagram;
        this.website = website;
    }

    public HairDresser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "HairDresser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instagram='" + instagram + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
