package com.fhdone.springboot;


import com.fhdone.springboot.job.AsyncCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;


//https://blog.csdn.net/u011663149/article/details/88788259
//https://blog.csdn.net/u010502101/article/details/78759786

//@SpringBootApplication
public class DemoApplication {

    @Autowired
    AsyncCaller caller;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) throws InterruptedException {
        caller.printNumber();
        for(int i=1; i<10; i++){
            TimeUnit.MICROSECONDS.sleep(1);
            System.out.println("------------------");
        }
        return null;
    }
}
