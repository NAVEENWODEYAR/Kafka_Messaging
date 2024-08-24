package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.entiry.Users;
import com.kafka.producer.JsonKafkaProducer;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@RestController
@RequestMapping("/v1/json")
public class JsonMessageController {
	
	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;
	
	@PostMapping("/publish")
	public ResponseEntity<Object> publish(@RequestBody Users request){
		jsonKafkaProducer.sendMessage(request);	
		return ResponseEntity.ok("Message published successfully,");
	}

}
