package com.spring.Sp_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.spring.Sp_project.Controller", "com.spring.Sp_project.Model", "com.spring.Sp_project.Service" , "com.spring.Sp_project.Repository" })
public class SpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpProjectApplication.class, args);  
	}
}
