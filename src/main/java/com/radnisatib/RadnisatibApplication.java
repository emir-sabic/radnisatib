package com.radnisatib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;



@SpringBootApplication
@CrossOrigin(origins = "/**")
public class RadnisatibApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadnisatibApplication.class, args);
	}

}
