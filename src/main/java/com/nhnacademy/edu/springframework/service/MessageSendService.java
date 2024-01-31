package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.annotation.Language;
import com.nhnacademy.edu.springframework.annotation.Sms;
import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;
    private String phoneNumber;

    private String name;

    private String message;

//    public MessageSendService() {
//    }

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender")MessageSender messageSender,@Value("${name}")String name, @Value("${value}")String message){
        this.messageSender = messageSender;
        this.name=name;
        this.message=message;
    }

    public MessageSendService(@Qualifier("smsMessageSender")MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user){
        System.out.println("From : " + phoneNumber);
        user.setName(name);
        messageSender.sendMessage(user, message);
    }
}
