package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = { "com.example.demo" })
@ServletComponentScan
@Configuration
public class CustdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustdemoApplication.class, args);
	}

}
