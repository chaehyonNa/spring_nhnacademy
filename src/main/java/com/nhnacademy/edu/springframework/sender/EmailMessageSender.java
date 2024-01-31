package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class EmailMessageSender implements MessageSender{
    @Value("hookUrl")
    private String url;

    @Value("name")
    private String name;

    @Value("value")
    private String value;
    public EmailMessageSender() {
        System.out.println("EmailMessageSender initiated!!");
    }

    public void init() {
        System.out.println("--------------------init");
    }

    public void destroy() {
        System.out.println("EmailMessageSender destory called!!");
    }
    @Override
    public boolean sendMessage(User user, String message) {
        new DoorayHookSender(new RestTemplate(), url)
                .send(DoorayHook.builder()
                        .botName(name)
                        .text(value)
                        .build());
        return true;
//        System.out.println(user.getEmail() + " : " + message);
    }
}
