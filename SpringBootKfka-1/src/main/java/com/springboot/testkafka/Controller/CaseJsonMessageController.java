package com.springboot.testkafka.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.testkafka.kafka.JsonKafkaCaseProducer;
import com.springboot.testkafka.payload.Case;

@RestController
@RequestMapping("/api/v1/kafka")
public class CaseJsonMessageController {
	
	private JsonKafkaCaseProducer kafkaProducer;

    public CaseJsonMessageController(JsonKafkaCaseProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/casePublish")
    public ResponseEntity<String> publish(@RequestBody Case case1){
        kafkaProducer.sendMessage(case1);
        return ResponseEntity.ok("case Json message sent to kafka topic");
    }

}
