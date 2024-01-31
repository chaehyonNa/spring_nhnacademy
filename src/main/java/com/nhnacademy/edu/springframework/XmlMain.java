package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args){
        User user = new User("user@naver", "010-1234-5678");
        //try with resorces, auto closalbe 되는것이 가능
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
//            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
//            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

//            MessageSendService messageSendService = context.getBean("messageSenderService",MessageSendService.class);

//            messageSendService.doSendMessage(user,"Hi eamil");
        }
    }
}
