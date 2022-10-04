//package com.example.demojwt.activeMQ;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.TextMessage;
//
//@Component
//public class Listener {
//    @Autowired
//    private Producer producer;
//
////    tên queue mà bộ lắng nghe sẽ nhận tin nhắn từ đó.
//    @JmsListener(destination = "inbound.queue")
//    public void receiveMessage(Message jsonMessage) throws JMSException {
//        String messageData = null;
//        System.out.println("Nhận tin nhắn: " + jsonMessage);
//        if(jsonMessage instanceof TextMessage) {
//            TextMessage textMessage = (TextMessage)jsonMessage;
//            messageData = textMessage.getText();
//        }
//
//        producer.sendMessage("outbound.queue", messageData);
//    }
//}
