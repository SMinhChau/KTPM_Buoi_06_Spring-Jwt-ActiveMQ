package com.example.demojwt.controller;

import com.example.demojwt.model.Message;
import com.example.demojwt.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class PublisherController   {
    private final Producer producer;

    public PublisherController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Message message) {
        try {
            producer.send(message);
            return new ResponseEntity<>("Sent", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
