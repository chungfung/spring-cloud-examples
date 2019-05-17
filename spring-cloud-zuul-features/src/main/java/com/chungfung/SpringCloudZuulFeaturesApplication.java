package com.chungfung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulFeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulFeaturesApplication.class, args);
	}

}
