package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework");
        context.getBean("messageSendService", MessageSendService.class).doSendMessage();
    }
}
