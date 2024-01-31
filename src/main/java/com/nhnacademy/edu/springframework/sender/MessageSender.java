package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public interface MessageSender {
    public void sendMessage(User user, String message);
}
