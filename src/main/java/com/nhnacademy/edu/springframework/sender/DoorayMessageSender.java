package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class DoorayMessageSender implements MessageSender{
    @Value("${hookUrl}")
    private String hookUrl;

    @Value("${name}")
    private String name;

    @Value("${text}")
    private String text;
    @Override
    public boolean sendMessage() {
        new DoorayHookSender(new RestTemplate(), hookUrl)
                .send(DoorayHook.builder()
                        .botName(name)
                        .text(text)
                        .build());
        return true;
    }
}
