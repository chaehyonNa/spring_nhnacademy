package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class DoorayMessageSender implements MessageSender{
    @Value("${hookUrl}")
    private String hookUrl;

    public void setDoorayHookSender(DoorayHookSender doorayHookSender) {
        System.out.println("setDoorayHookSender");
    }
    @Override
    public boolean sendMessage(User user) {
        new DoorayHookSender(new RestTemplate(), hookUrl)
                .send(DoorayHook.builder()
                        .botName(user.getName())
                        .text(user.getText())
                        .build());
        return true;
    }
}
