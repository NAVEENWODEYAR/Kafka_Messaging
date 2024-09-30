package com.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.KafkaProducer;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@RestController
@RequestMapping("/v1/message")
public class MessageController {
	
	private static final Logger log = LoggerFactory.getLogger(MessageController.class);
	
	private KafkaProducer kafkaProducer;
	
	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	@GetMapping
	public ResponseEntity<Object>test(){
		log.info("Test endPoint,");
		return ResponseEntity.ok("Welome to the Kafka_World,");
	}

	@GetMapping("/publish")
	public ResponseEntity<Object>publish(@RequestParam("msg") String msg){
		log.warn("Publishing the message");
		kafkaProducer.sendMessage(msg);
		log.info("Producer published the mesage,");
		return ResponseEntity.ok("Message published successfully,");
	}

}
