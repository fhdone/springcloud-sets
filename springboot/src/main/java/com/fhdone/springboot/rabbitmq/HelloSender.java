package com.fhdone.springboot.rabbitmq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }


    public void send(Integer i) {
        String context = i+": hello " + new Date();
        System.out.println("Sender :" + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void sendTm1(Integer i) {
        String context = i+" hi, i am message tm";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void sendTm2(Integer i) {
        String context = i+" hi, i am messages tms";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }



}
