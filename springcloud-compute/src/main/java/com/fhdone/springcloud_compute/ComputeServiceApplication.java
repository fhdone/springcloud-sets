package com.fhdone.springcloud_compute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class ComputeServiceApplication {
	public static void main(String[] args) {
		//new SpringApplicationBuilder(ComputeServiceApplication.class).web(WebApplicationType.SERVLET).run(args);
        SpringApplication.run(ComputeServiceApplication.class, args);
	}
}