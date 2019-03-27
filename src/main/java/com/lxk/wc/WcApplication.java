package com.lxk.wc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WcApplication.class, args);
	}

}
