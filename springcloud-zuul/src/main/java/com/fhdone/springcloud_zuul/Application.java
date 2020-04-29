package com.fhdone.springcloud_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.fhdone.springcloud_zuul.filter.AccessFilter;


//http://192.168.1.7:5555/api-b/add?accessToken=1111&a=100&b=300
@EnableZuulProxy
@SpringCloudApplication
public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
