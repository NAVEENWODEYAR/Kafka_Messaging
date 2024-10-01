package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${spring.kafka.topic.name}")
	private String kafkaTopicName;
	
	@Value("${spring.kafka.topic-json.name}")
	private String kafkaTopicJsonName;

    @Bean
    NewTopic newTopic() {
		return TopicBuilder
						.name(kafkaTopicName)
						.build();
	}

    @Bean
    NewTopic firstTopic() {
		return TopicBuilder
						.name(kafkaTopicJsonName)
						.build();
	}
	
}
