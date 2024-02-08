package com.example.fintech.paymentdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private static final String TOPIC = "transactions";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendTransaction(String transaction) {
        // Here, you can add any business logic, like validation or processing, before sending the transaction
        kafkaTemplate.send(TOPIC, transaction);
    }
}
