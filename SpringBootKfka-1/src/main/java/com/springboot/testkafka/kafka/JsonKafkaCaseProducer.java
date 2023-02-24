package com.springboot.testkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.springboot.testkafka.payload.Case;


@Service
public class JsonKafkaCaseProducer {
	 private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaCaseProducer.class);

	 @Autowired
	    private KafkaTemplate<String, Case> kafkaTemplate;

	    public void sendMessage(Case case1){
	        LOGGER.info(String.format("Message sent -> %s", case1.toString()));
    LOGGER.info(String.format("Message sent -> %s", case1.toString()));

	        Message<Case> message = MessageBuilder
	                .withPayload(case1)
	                .setHeader(KafkaHeaders.TOPIC,"case.javaguides.json")// AppConstants.TOPIC_NAME)
	                .build();

	        kafkaTemplate.send(message);
	    }

}
