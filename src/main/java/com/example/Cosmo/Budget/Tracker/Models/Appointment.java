package com.example.Cosmo.Budget.Tracker.Models;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private Double deposit;
    private Double hairCost;
    private Double serviceCost;
    private Double tip;

    @ManyToOne
    private WebUser webUser;

    public Appointment(LocalDate date, LocalTime time, String location, Double deposit, Double hairCost, Double serviceCost, Double tip) {
        this.date = date;
        this.time = time;
        this.location = location;
        this.deposit = deposit;
        this.hairCost = hairCost;
        this.serviceCost = serviceCost;
        this.tip = tip;
    }

    public Appointment() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getHairCost() {
        return hairCost;
    }

    public void setHairCost(Double hairCost) {
        this.hairCost = hairCost;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public Double getTip() {
        return tip;
    }

    public void setTip(Double tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", deposit=" + deposit +
                ", hairCost=" + hairCost +
                ", serviceCost=" + serviceCost +
                ", tip=" + tip +
                '}';
    }
}
