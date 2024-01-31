package com.nhnacademy.edu.springframework.annotation;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"}, includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MessageSender.class))
//@Service
public class SendConfig {
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

      public MessageSender emilMessageSender() {
        return new EmailMessageSender();
    }
}
