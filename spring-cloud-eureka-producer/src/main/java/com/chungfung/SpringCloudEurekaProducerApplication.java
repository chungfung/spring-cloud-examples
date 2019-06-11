package com.chungfung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaProducerApplication.class, args);
	}

}
