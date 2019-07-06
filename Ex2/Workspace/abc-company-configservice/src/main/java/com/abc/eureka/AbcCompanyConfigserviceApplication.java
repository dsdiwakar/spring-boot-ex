package com.abc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AbcCompanyConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcCompanyConfigserviceApplication.class, args);
	}

}
