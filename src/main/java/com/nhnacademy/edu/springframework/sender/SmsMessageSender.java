package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class SmsMessageSender implements MessageSender{
    public void init() {
        System.out.println("SmsMessageSender init called!!");
    }
    public void cleanup() {
        System.out.println("SmsMessageSender destory called!!");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(user.getPhoneNumber() + message);
    }
}
