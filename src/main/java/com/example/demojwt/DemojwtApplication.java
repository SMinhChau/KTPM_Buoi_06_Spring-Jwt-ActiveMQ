package com.example.demojwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.jms.annotation.EnableJms;



@SpringBootApplication
@EnableJms
public class DemojwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojwtApplication.class, args);

	}


}
