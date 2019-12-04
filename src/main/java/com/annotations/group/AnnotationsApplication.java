package com.annotations.group;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.annotations.group.core.Organization;
import com.annotations.group.repo.IOrganizationRepo;

@SpringBootApplication
public class AnnotationsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(AnnotationsApplication.class, args);

		
	}
	
	@Profile("demo")
	@Bean
	CommandLineRunner initDatabase(IOrganizationRepo organizationRepo) {

		return args->{
			organizationRepo.save(new Organization("Mastek", "IT"));
		};
	}

}
