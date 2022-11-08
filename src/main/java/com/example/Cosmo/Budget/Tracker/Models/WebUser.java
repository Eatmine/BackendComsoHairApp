package com.example.Cosmo.Budget.Tracker.Models;

import javax.persistence.*;


@Entity
public class WebUser {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String pass;
    private String hairstyleType;
    private String city;

    private Double hairBudget;

    private Double appointmentBudget;

    @ManyToOne
    private HairDresser hairDresser;


    public WebUser(String email,
                   String pass,
                   String hairstyleType,
                   String city,
                   Double hairBudget,
                   Double appointmentBudget

    )
    {
        this.email = email;
        this.pass = pass;
        this.hairstyleType = hairstyleType;
        this.city = city;
        this.hairBudget = hairBudget;
        this.appointmentBudget = appointmentBudget;
    }

    public WebUser(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return email;
    }

    public void setUsername(String email) {
        this.email = email;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getHairstyle() {
        return hairstyleType;
    }
    public void setHairstyle(String hairstyleType) {
        this.hairstyleType = hairstyleType;
    }

    public Double getHairBudget() {return hairBudget;}

    public void setHairBudget(Double hairBudget) {this.hairBudget = hairBudget;}

    public Double getAppointmentBudget() {return appointmentBudget;}

    public void setAppointmentBudget(Double appointmentBudget) {this.appointmentBudget = appointmentBudget;}



    public Long getId() {
        return id;
    }

    @Override
    public String toString() {

        return "webUser{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + pass + '\'' +
                ", hairstyleType='" + hairstyleType + '\'' +
                ", city='" + city + '\'' +
                "hairBudget=" + hairBudget+
                "appointmentBudget=" + appointmentBudget+
                '}';
    }
}


