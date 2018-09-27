package com.piggymetrics.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
	private static final Logger LOG = LoggerFactory.getLogger(ConfigApplication.class.getName());

	public static void main(String[] args) {
		LOG.info("Starting config server");
		SpringApplication.run(ConfigApplication.class, args);
	}
}
