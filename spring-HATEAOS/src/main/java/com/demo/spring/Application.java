package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application /* extends SpringBootServletInitializer */ {

	public static void main(String[] args) {
		// new Application().configure(new
		// SpringApplicationBuilder(JaxRSApplication.class)).run(args);
		SpringApplication.run(Application.class, args);
	}
}
