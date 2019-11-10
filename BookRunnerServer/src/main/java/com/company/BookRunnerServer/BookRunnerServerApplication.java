package com.company.BookRunnerServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookRunnerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRunnerServerApplication.class, args);
	}

}
