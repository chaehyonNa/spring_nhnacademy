package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class SmsMessageSender implements MessageSender {
    @Value("hookUrl")
    private String url;

    public SmsMessageSender() {
        System.out.println("SmsMessageSender initiated!!");
    }
    public void init() {
        System.out.println("--------------------init");
    }
    public void destroy() {
        System.out.println("EmailMessageSender destory called!!");
    }
    @Override
    public boolean sendMessage(User user, String message) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3204376758577275363/3727553265487230503/DIiyr9z0ROKJksd5yMFedQ")
                .send(DoorayHook.builder()
                        .botName(user.getName())
                        .text(message)
                        .build());
        return true;
//        System.out.println(user.getS() + " : " + message);
    }
}
