package com.rabbitmq.example.consumer;

import org.springframework.stereotype.Component;

/**
 * Created by Aaron on 2017/9/26.
 */
@Component("rabbitmMqMsgReceiver")
public class RabbitmMqMsgReceiver {

	public void receiveMsg(String message){
		System.out.println("received:"+message);
	}
}
