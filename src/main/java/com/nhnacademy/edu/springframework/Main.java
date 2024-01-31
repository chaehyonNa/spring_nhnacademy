package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        User user = new User("user@naver.com", "010-1234-1234");
        String message = "안녕";
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            MessageSender smsMessageSender = context.getBean("smsMessageSender",MessageSender.class);
            MessageSender emailMessageSender = context.getBean("emailMessageSender",MessageSender.class);

            smsMessageSender.sendMessage(user, message);
            emailMessageSender.sendMessage(user, message);
        }
    }
}
