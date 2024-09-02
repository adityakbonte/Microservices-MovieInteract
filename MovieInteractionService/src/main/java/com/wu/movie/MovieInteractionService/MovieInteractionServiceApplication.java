package com.wu.movie.MovieInteractionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MovieInteractionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInteractionServiceApplication.class, args);
	}

}
