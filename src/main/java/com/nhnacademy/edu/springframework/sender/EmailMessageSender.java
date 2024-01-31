package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class EmailMessageSender implements MessageSender{
    public void init() {
        System.out.println("EmailMessageSender init called!!");
    }
    public void cleanup() {
        System.out.println("EmailMessageSender destory called!!");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(user.getEmail() + message);
    }
}
