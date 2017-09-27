package com.rabbitmq.example.producer;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Aaron on 2017/9/26.
 */
public class RabbitMqMsgSender {

	private RabbitTemplate template;

	public void setTemplate(RabbitTemplate template){
		this.template = template;
	}

	public void sendMessage(String message){
		template.convertAndSend(message);
	}
}
