package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"})
public class MainConfig {

    @Bean
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

//    @Bean
//    public MessageSender emailMessageSender() {
//        return new EmailMessageSender();
//    }

    @Bean
    public MessageSendService messageSendService(MessageSender messageSender){
        return new MessageSendService(messageSender);
    }
}
