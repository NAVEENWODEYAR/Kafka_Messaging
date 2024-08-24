package com.kafka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Slf4j
@Service
public class KafkaProducer {
	
	@Value("${spring.kafka.topic.name}")
	private String kafkaTopicName;
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String msg) {
		log.info(String.format("Message sent %s", msg));
		kafkaTemplate.send(kafkaTopicName,msg);
	}

}
