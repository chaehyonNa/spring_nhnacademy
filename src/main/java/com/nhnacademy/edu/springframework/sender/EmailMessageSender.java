package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class EmailMessageSender implements MessageSender{
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println(user.getEmail() + message);
        return true;
    }
}
