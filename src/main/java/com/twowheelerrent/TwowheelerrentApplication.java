package com.twowheelerrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class TwowheelerrentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwowheelerrentApplication.class, args);
	}

}
