package com.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Service
public class KafkaProducer {
	
	private static final Logger log = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	@Value("${spring.kafka.topic.name}")
	private String kafkaTopicName;
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String msg) {
		log.info(String.format("Message sending %s", msg));
		kafkaTemplate.send(kafkaTopicName,msg);
		log.warn("Message sent");
	}

}
