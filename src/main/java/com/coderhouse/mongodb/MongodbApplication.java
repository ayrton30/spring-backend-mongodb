package com.coderhouse.mongodb;

import com.coderhouse.mongodb.model.Producto;
import com.coderhouse.mongodb.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MongodbApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Bean
	public CommandLineRunner loadData(ProductoRepository repository) {
		return (args) -> {
			repository.save(Producto.builder().title("producto1").price(2000).build());
			repository.save(Producto.builder().title("producto2").price(1000).build());
			repository.save(Producto.builder().title("producto3").price(510).build());
		};
	}

}
