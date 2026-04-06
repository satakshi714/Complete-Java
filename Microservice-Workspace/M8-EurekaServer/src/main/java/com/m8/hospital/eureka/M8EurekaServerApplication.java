package com.m8.hospital.eureka;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class M8EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M8EurekaServerApplication.class, args);
	}

}
