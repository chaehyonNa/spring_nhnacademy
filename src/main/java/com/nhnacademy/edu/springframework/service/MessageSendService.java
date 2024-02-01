package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.annotation.How;
import com.nhnacademy.edu.springframework.annotation.MessageSenderQualifier;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {
    private MessageSender messageSender;

    @Autowired
    public MessageSendService(@MessageSenderQualifier(how = How.DOORAY) MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        messageSender.sendMessage();
    }

}
