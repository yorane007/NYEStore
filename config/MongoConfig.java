package com.sinq.nystore.config;

import com.sinq.nystore.model.Product;
import com.sinq.nystore.repository.IProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = IProductRepo.class)
@Configuration
public class MongoConfig {
	@Bean
	CommandLineRunner commandLineRunner(IProductRepo iProductRepo) {
		return strings -> {
			//iProductRepo.save(new Product(1, "Product1", "Description", "Category"));
			iProductRepo.save(new Product());
		};
	}

}
