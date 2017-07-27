package com.fhdone.springcloud_zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.fhdone.springcloud_zuul.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
	
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
