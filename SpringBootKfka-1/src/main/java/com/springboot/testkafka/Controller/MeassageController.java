package com.springboot.testkafka.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.testkafka.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MeassageController {
	
	private KafkaProducer kafkaProducer;

	public MeassageController(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	
	
	
//	http://localhost:8081/api/v1/kafka/publish?message=Hello world
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("message sent to ht topic");
		
		
		
	}

}
