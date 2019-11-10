package com.company.BookPostServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookPostServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPostServerApplication.class, args);
	}

}
