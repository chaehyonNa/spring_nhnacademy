package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public interface MessageSender {
    public boolean sendMessage(User user);
}
