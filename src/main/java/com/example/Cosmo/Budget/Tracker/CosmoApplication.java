package com.example.Cosmo.Budget.Tracker;

import com.example.Cosmo.Budget.Tracker.Models.Appointment;
import com.example.Cosmo.Budget.Tracker.Repositories.AppointmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CosmoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmoApplication.class, args);

	}
//	@Bean
//	public CommandLineRunner run(AppointmentRepository repository){
//		return (args -> {
//			insertJavaAdvocates(repository);
//			System.out.println(repository.findAll());
//		});
//
//	}
//	private void insertJavaAdvocates (AppointmentRepository webUserRepository){
//		webUserRepository.save(new Appointment("Edmine", "SugaMama",2000.00,3000.00,"braids", "Jacksonville"));
//		webUserRepository.save(new Appointment("Tony", "Formation",1000.00,2000.00,"extension","Jacksonville"));
//		webUserRepository.save(new Appointment("Annie", "SayMyName",980.00,1200.09,"relaxer","Jacksonville"));
//
//	}




}
