package com.pfa.elklogsswaggerrestfulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class ElkLogsSwaggerRestfulApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(ElkLogsSwaggerRestfulApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ElkLogsSwaggerRestfulApiApplication.class, args);
		logger.info("App Start");

	}

}
