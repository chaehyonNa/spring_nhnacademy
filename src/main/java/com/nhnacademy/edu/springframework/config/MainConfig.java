package com.nhnacademy.edu.springframework.config;

import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.sender.DoorayMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {

    @Value("${hookUrl}")
    private String hookUrl;

    @Bean
    @Scope("singleton")
    public DoorayHookSender doorayHookSender() {
        return new DoorayHookSender(new RestTemplate(),hookUrl);
    }
    @Bean
    public MessageSender doorayMessageSender() {
        return new DoorayMessageSender();
    }

    @Bean
    public MessageSendService messageSendService(MessageSender messageSender) {
        return new MessageSendService(messageSender);
    }
}
