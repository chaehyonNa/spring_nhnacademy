package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"})
@ImportResource("classpath:/beans.xml")
public class MainConfig {

//    @Bean
//    public MessageSender smsMessageSender() {
//        return new SmsMessageSender();
//    }

    @Bean
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }

    @Bean
    public MessageSendService messageSendService(MessageSender messageSender){
        return new MessageSendService(messageSender);
    }
}
