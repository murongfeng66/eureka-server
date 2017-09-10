package com.zjw.eurekaserver.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class One {

	public static void main(String[] args) {
		SpringApplication.run(One.class, args);
	}

}
