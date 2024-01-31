package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.annotation.How;
import com.nhnacademy.edu.springframework.annotation.MessageSenderQualifier;
import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class MessageSendService {
    private MessageSender messageSender;

//    @Autowired
//    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }

    @Autowired
    public MessageSendService(@MessageSenderQualifier(how = How.SMS,dummy = false) MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }

    public void setSmsMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
