package com.kafkaexample.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "mohamedcode",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received: " + data + ":D");
    }
}
