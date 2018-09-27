package com.piggymetrics.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayApplication {
	private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class.getName());

	public static void main(String[] args) {
		LOG.info("Starting gateway");
		SpringApplication.run(GatewayApplication.class, args);
	}
}
