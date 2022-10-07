package com.example.Cosmo.Budget.Tracker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WebUser {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private double hairBudget;
    private double appointmentBudget;
    private String hairstyleType;


    public void setId(Long id) {
        this.id = id;
    }

    public WebUser(String username, String password, double hairBudget, double appointmentBudget, String hairstyleType) {
        this.username = username;
        this.password = password;
        this.hairBudget = hairBudget;
        this.appointmentBudget = appointmentBudget;
        this.hairstyleType = hairstyleType;
    }

    public WebUser(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getHairBudget() {
        return hairBudget;
    }

    public void setHairBudget(double hairBudget) {
        this.hairBudget = hairBudget;
    }

    public double getAppointmentBudget() {
        return appointmentBudget;
    }

    public void setAppointmentBudget(double appointmentBudget) {
        this.appointmentBudget = appointmentBudget;
    }

    public String getHairstyle() {
        return hairstyleType;
    }

    public void setHairstyle(String hairstyleType) {
        this.hairstyleType = hairstyleType;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "webUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hairBudget=" + hairBudget +
                ", appointmentBudget=" + appointmentBudget +
                ", hairstyleType='" + hairstyleType + '\'' +
                '}';
    }
}


