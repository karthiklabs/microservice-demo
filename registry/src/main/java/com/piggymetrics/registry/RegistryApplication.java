package com.piggymetrics.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {
	private static final Logger LOG = LoggerFactory.getLogger(RegistryApplication.class.getName());
	public static void main(String[] args) {
		LOG.info("Starting eureka registry");
		SpringApplication.run(RegistryApplication.class, args);
	}
}
