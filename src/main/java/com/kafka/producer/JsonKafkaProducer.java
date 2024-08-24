package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
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
	
//	public JsonKafkaProducer(KafkaTemplate<String,Users> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}

	public void sendMessage(Users data) {
		log.info(String.format("Message produced & sending -> %s",data.toString()));
		Message<Users> message = MessageBuilder
									.withPayload(data)
									.setHeader(KafkaHeaders.TOPIC, "mensagensTopic_json")
									.build();
		kafkaTemplate.send(message);
		log.info(String.format("Message sent -> %s",data.toString()));
	}
}
