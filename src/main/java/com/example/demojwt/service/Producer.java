package com.example.demojwt.service;

import com.example.demojwt.model.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private final JmsTemplate jmsTemplate;
    private final ObjectMapper mapper;

    @Value("${spring.activemq.broker-url}")
    private String queueDestination;

    public Producer(JmsTemplate jmsTemplate, ObjectMapper mapper) {
        this.jmsTemplate = jmsTemplate;
        this.mapper = mapper;
    }

    public void send(Message message) throws JsonProcessingException {
        jmsTemplate.convertAndSend(queueDestination, mapper.writeValueAsString(message));
    }
}
