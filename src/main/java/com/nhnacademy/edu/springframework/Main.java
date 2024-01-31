package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.*;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;

public class Main {
    public static void main(String[] args) {
        User user = new User("@naver.com","123456");
//        new MessageSendService(new EmailMessageSender()).doSendMessage(user,"hi");
//        new MessageSendService(new SmsMessageSender()).doSendMessage(user,"hi");
    }
}