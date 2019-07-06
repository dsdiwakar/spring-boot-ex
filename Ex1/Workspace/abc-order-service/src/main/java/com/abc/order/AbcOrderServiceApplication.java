package com.abc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AbcOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcOrderServiceApplication.class, args);
	}

}
