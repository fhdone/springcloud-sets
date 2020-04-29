package com.fhdone.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// http://www.jianshu.com/p/1a9fd8936bd8
@SpringBootApplication
@EnableScheduling
//@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableAutoConfiguration
//@EnableConfigurationProperties
//@ComponentScan
public class Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
