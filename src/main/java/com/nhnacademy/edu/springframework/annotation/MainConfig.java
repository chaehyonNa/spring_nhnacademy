package com.nhnacademy.edu.springframework.annotation;

import com.nhnacademy.edu.springframework.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration
//@ImportResource("classpath:/beans.xml")
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"}, includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MessageSendService.class))
@PropertySource("classpath:name.properties")
@EnableAspectJAutoProxy
public class MainConfig {
    @Autowired
    private SendConfig sendConfig;

    public MessageSendService messageSendService() {
        return new MessageSendService(sendConfig.smsMessageSender());
    }
}
