package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.sender.DoorayMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
    @Bean
    public MessageSender doorayMessageSender() {
        return new DoorayMessageSender();
    }

    @Bean
    public MessageSendService messageSendService() {
        return new MessageSendService();
    }
}
