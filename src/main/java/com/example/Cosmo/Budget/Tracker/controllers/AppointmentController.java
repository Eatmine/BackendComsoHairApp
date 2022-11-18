package com.example.Cosmo.Budget.Tracker.controllers;
import com.example.Cosmo.Budget.Tracker.Models.Appointment;
import com.example.Cosmo.Budget.Tracker.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
//RequestMapping("/appointment/api")
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping("/addAppointment")
    public Appointment addAppointments(@Valid @RequestBody Appointment appointment)

    {return appointmentRepository.save(appointment);}

    @GetMapping("/getAppointments")
    public Iterable<Appointment> getAppointment() {
        return appointmentRepository.findAll();
    }
}

