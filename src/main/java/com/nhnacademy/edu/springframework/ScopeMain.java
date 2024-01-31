package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
    public static void main(String[] args){
        User user = new User("user@naver.com", "010-1234-5678");
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

//            System.out.println("---------");
//            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage(user,"Hi");
//            System.out.println("---------");
//            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage(user,"Hi");
//            System.out.println("---------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage(user,"Hi");
//            System.out.println("---------");
//            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage(user,"Hi");
//            System.out.println("---------");
        }
    }
}
