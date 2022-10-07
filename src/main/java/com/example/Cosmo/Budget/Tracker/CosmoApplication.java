package com.example.Cosmo.Budget.Tracker;

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
//	public CommandLineRunner run(WebUserRepository repository){
//		return (args -> {
//			insertJavaAdvocates(repository);
//			System.out.println(repository.findAll());
//		});
//
//	}
//	private void insertJavaAdvocates (WebUserRepository webUserRepository){
//		webUserRepository.save(new WebUser("Edmine", "SugaMama",2000.00,3000.00,"braids"));
//		webUserRepository.save(new WebUser("Tony", "Formation",1000.00,2000.00,"extension"));
//		webUserRepository.save(new WebUser("Annie", "SayMyName",980.00,1200.09,"relaxer"));
//
//	}




}
