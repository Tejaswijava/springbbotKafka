package com.springboot.testkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.testkafka.payload.User;

@Service
public class JsonKafkaConsumer {

private static final Logger LOOGER=LoggerFactory.getLogger(JsonKafkaConsumer.class);

@KafkaListener(topics="javaGuides_json", groupId ="myGroup")
public void consume(User user) {
	LOOGER.info(String.format("Json message received %s", user));
}
}
