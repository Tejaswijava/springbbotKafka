package com.springboot.testkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
/*	@Bean //this method is for creating new topic named as javaguides
	public NewTopic JavaguidesTopic() {
		return TopicBuilder.name("javaguides")
				//.partitions(10)  if u want to add partitions otherwise default partitions will be added by kafka
				.build();
	}
	
	@Bean
	public NewTopic JavaguidesJsonTopic() {
		return TopicBuilder.name("javaguides_json")
				//.partitions(10)  if u want to add partitions otherwise default partitions will be added by kafka
				.build();
	}
	
	@Bean
	public NewTopic JavaguidesCaseJsonTopic() {
		return TopicBuilder.name("case.javaguides.json")
				//.partitions(10)  if u want to add partitions otherwise default partitions will be added by kafka
				.build();
	}
	
*/
}
