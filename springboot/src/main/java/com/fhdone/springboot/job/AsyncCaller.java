package com.fhdone.springboot.job;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncCaller {

    @Async
    public void printNumber(){
        for(int i=1; i<10; i++){
            System.out.println("i = " + i);
        }
        //throw new RuntimeException("one run exception printNumber");
    }

}