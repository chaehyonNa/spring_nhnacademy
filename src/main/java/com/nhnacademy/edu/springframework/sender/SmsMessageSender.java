package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class SmsMessageSender implements MessageSender{
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println(user.getPhoneNumber() + message);
        return true;
    }

}
