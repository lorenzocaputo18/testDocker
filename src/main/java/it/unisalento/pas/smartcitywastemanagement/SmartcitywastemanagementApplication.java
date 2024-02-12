package it.unisalento.pas.smartcitywastemanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class SmartcitywastemanagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(SmartcitywastemanagementApplication.class, args);


	}

	
	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {

			// usingMongoTemplateAndQuery(mongoTemplate);
			repository.findStudentByEmail("lorenzo.caputo18@gmail.com").ifPresentOrElse(s ->{
				System.out.println("studente trovato");
			}, () -> {
				System.out.println("nessuno studente trovato");
			});

		};

	}


}
