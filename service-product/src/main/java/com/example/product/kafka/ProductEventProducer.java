package com.example.product.kafka;

import com.example.kafka.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductEventProducer {

    @Autowired
    private final KafkaTemplate<String, Event> kafkaTemplate;

    private static final String COMMAND_TOPIC = "product-command";
    private static final String RESULT_TOPIC = "product-result";

    public void sendCommandEvent(Object event) {
        kafkaTemplate.send(COMMAND_TOPIC, new Event(event.getClass().getName(), event));
    }

    public void sendResultEvent(Object event) {
        kafkaTemplate.send(RESULT_TOPIC, new Event(event.getClass().getName(), event));
    }
}
