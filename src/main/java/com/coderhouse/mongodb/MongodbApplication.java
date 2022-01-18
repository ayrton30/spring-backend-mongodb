package com.coderhouse.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MongodbApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
