package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;

    @Value("${name}")
    private String name;

    @Value("${text}")
    private String text;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public boolean doSendMessage(){
        User user = new User(name,text);
        return messageSender.sendMessage(user);
    }
}
