package com.springboot.testkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.springboot.testkafka.payload.User;
import com.springboot.testkafka.payload.UserData;
import com.springboot.testkafka.payload.UserJbpm;

@Service
public class JsonKafkaProducer {
	 private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

	    @Autowired
	    private KafkaTemplate<String, UserData> kafkaTemplate;

	    public void sendMessage(UserData data){
	        LOGGER.info(String.format("Message sent -> %s", data.toString()));

	        Message<UserData> message = MessageBuilder
	                .withPayload(data)
	                .setHeader(KafkaHeaders.TOPIC,"topic-example3")// AppConstants.TOPIC_NAME)
	                .build();

	        kafkaTemplate.send(message);
	    }

}
