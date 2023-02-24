package com.springboot.testkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

//import com.springboot.testkafka.payload.Case;
import com.springboot.testkafka.payload.CaseSRDataDto;

@Service
public class DTOJsonKafkaProducer {
	private static final Logger LOGGER = LoggerFactory.getLogger(DTOJsonKafkaProducer.class);

	 @Autowired
	    private KafkaTemplate<String, CaseSRDataDto> kafkaTemplate;

	    public void sendMessage(CaseSRDataDto case1){
	    	 LOGGER.info(String.format("DTOMessage sent -> %s", case1.toString()));
	    	    LOGGER.info(String.format("DTOMessage sent -> %s", case1.toString()));

	    		        Message<CaseSRDataDto> message = MessageBuilder
	    		                .withPayload(case1)
	    		                .setHeader(KafkaHeaders.TOPIC,"topic-SRCreated")//"topic-SRCreated" AppConstants.TOPIC_NAME)
	    		                .build();

	    		        kafkaTemplate.send(message);

	    }
}
