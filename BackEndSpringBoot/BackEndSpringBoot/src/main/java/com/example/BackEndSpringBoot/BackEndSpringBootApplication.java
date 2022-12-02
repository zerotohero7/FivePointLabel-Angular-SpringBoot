package com.example.BackEndSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BackEndSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndSpringBootApplication.class, args);
	}

}
