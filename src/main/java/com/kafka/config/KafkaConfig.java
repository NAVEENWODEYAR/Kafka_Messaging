package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Naveen K Wodeyar
 * @date 24-Aug-2024
 * @project Mensagens
 */
@Configuration
public class KafkaConfig {

	@Bean
	public NewTopic newTopic() {
		return TopicBuilder
						.name("mensagensTopic")
						.build();
	}
	
	@Bean
	public NewTopic firstTopic() {
		return TopicBuilder
						.name("mensagensTopic_json")
						.build();
	}
	
}
