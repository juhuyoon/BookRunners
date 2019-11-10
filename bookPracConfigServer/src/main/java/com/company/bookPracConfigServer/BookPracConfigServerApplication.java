package com.company.bookPracConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookPracConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPracConfigServerApplication.class, args);
	}

}
