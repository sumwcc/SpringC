package com.su.eurekaserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerConfigApplication.class, args);
	}
}
