package com.fhdone.springcloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


// http://192.168.33.69:7001/demo/dev
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
//		new SpringApplicationBuilder(Application.class).web(true).run(args);
        SpringApplication.run(Application.class, args);
	}
}