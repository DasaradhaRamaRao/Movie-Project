package com.demo.movie.movieapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.demo.movie.repository")
@ComponentScan(basePackages="com.demo.movie.controller")
@ComponentScan(basePackages="com.demo.movie.beans")
@ComponentScan(basePackages="com.demo.movie.entity")
@ComponentScan(basePackages="com.demo.movie.repository")
@ComponentScan(basePackages="com.demo.movie.service")
public class MovieappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieappApplication.class, args);
	}

}
