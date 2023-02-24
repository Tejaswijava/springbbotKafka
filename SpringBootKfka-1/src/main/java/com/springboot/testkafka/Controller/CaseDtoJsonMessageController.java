package com.springboot.testkafka.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.testkafka.kafka.DTOJsonKafkaProducer;
import com.springboot.testkafka.kafka.JsonKafkaCaseProducer;
import com.springboot.testkafka.payload.Case;
import com.springboot.testkafka.payload.CaseSRDataDto;

@RestController
@RequestMapping("/api/v1/kafka")
public class CaseDtoJsonMessageController {

	private DTOJsonKafkaProducer kafkaProducer;

    public CaseDtoJsonMessageController(DTOJsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/caseDTOPublish")
    public ResponseEntity<String> publish(@RequestBody CaseSRDataDto caseDTO1){
        kafkaProducer.sendMessage(caseDTO1);
        return ResponseEntity.ok("case Json message sent to kafka topic");
    }


}
