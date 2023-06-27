package com.study.batch.demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class QuartzsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzsApplication.class, args);
	}

}
