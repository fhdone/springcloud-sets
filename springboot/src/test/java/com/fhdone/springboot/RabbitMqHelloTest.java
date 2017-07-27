package com.fhdone.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fhdone.springboot.rabbitmq.HelloSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

	@Autowired
	private HelloSender helloSender;

	@Test
	public void hello() throws Exception {
		helloSender.send();
	}

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<5;i++){
			helloSender.send(i);
		}
	}

	@Test
	public void helloTm() throws Exception {
		for (int i=0;i<10;i++){
			helloSender.sendTm1(i);
		}
		//		helloSender.sendtm2();
	}

	@Test
	public void helloTm2() throws Exception {
		for (int i=0;i<10;i++){
			helloSender.sendTm2(i);
		}
	}


}
