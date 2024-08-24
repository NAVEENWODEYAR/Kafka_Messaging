package com.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Service
public class KafkaConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "mensagensTopic",groupId = "my-group")
	public void consumeMessage(String msg) {
		log.info(String.format("Message cosumed by the consumer -> %s", msg));
		System.out.println("Message received,"+msg);
	}
}
