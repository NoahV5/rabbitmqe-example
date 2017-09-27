package com.rabbitmq.example.test;

import com.rabbitmq.example.producer.RabbitMqMsgSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Aaron on 2017/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-rabbitmq.xml"})
public class ExampleTest {

	@Test
	public  void test(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-rabbitmq.xml");
		RabbitMqMsgSender rabbitMqMsgSender = (RabbitMqMsgSender)ctx.getBean("rabbitMqMsgSender");
		rabbitMqMsgSender.sendMessage("Just rabbitmq example");
	}
}
