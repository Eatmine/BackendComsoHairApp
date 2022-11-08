package com.example.Cosmo.Budget.Tracker.controllers;
import com.example.Cosmo.Budget.Tracker.Models.Appointment;
import com.example.Cosmo.Budget.Tracker.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController



public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping("/addAppointment")
    public String addAppointments(  Double tip, Double deposit, Double hairCost, Double serviceCost,
                                  @RequestParam(value ="location", defaultValue = "100 elm Street") String location,
                                  @RequestParam(value = "date")
                                        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
                                @RequestParam(value = "time")
                                        @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime time)


    {
        Appointment appointment = new Appointment();
        appointment.setDate(date);
        appointment.setTime(time);
        appointment.setTip(tip);
        appointment.setDeposit(deposit);
        appointment.setHairCost(hairCost);
        appointment.setServiceCost(serviceCost);
        appointment.setLocation(location);
        appointmentRepository.save(appointment);
        return "Added new appointments to repo!";

    }


    @GetMapping("/getAppointments")
    public Iterable<Appointment> getAppointment() {
        return appointmentRepository.findAll();
    }
}

