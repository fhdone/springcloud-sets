package com.fhdone.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class HelloReceiverTM1 {

    @RabbitHandler
    public void process(String context) {
        System.out.println("TM1 Receiver  : " + context);
    }

}
