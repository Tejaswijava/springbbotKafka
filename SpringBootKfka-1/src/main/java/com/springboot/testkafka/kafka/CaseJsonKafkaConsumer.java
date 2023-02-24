package com.springboot.testkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.testkafka.payload.Case;

@Service
public class CaseJsonKafkaConsumer {

private static final Logger LOOGER=LoggerFactory.getLogger(CaseJsonKafkaConsumer.class);

@KafkaListener(topics="case.javaGuides.json", groupId ="myGroup")
public void consume(Case case1) {
	LOOGER.info(String.format("Json message received %s", case1));
}
}


