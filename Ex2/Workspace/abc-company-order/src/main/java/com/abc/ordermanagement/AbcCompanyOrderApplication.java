package com.abc.ordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AbcCompanyOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcCompanyOrderApplication.class, args);
	}

}
