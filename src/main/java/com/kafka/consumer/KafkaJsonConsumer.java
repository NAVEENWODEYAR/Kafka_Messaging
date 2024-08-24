package com.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.entiry.Users;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Service
public class KafkaJsonConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaJsonConsumer.class);
	
	@KafkaListener(topics = "${spring.kafka.topic-json.name}",groupId = "${spring.kafka.consumer.group-id}")
	public void consumeMessage(Users user) {
		log.info(String.format("JSON message received ->%s", user.toString()));
		System.out.println("User data,"+user.toString());
		log.error(String.format("JSON message received ->%s", user.toString()));

		
	}
}
