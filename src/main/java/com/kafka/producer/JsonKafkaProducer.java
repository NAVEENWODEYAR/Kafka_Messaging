package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.entiry.Users;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Slf4j
@Service
public class JsonKafkaProducer {

	@Autowired
	private KafkaTemplate<String,Users> kafkaTemplate;
	
	@Value("${spring.kafka.topic.name}")
	private String kafkaTopicName;
	
	@Value("${spring.kafka.topic-json.name}")
	private String kafkaTopicJsonName;

	public void sendMessage(Users data) {
		log.info(String.format("Message produced & sending -> %s",data.toString()));
		Message<Users> message = MessageBuilder
									.withPayload(data)
									.setHeader(KafkaHeaders.TOPIC, kafkaTopicJsonName)
									.build();
		kafkaTemplate.send(message);
		log.info(kafkaTemplate.toString());
		log.info(String.format("Message sent -> %s",data.toString()));
	}
}
