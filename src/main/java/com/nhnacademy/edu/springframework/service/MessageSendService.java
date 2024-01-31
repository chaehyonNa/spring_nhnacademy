package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }

    public void setSmsMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public MessageSendService() {

    }
}
