package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@PropertySource("classpath:MessageSend.properties")
public class DoorayMessageSender implements MessageSender{
    @Value("${hookUrl}")
    private String hookUrl;

    @Override
    public boolean sendMessage(User user) {
        new DoorayHookSender(new RestTemplate(), this.hookUrl)
                .send(DoorayHook.builder()
                        .botName(user.getName())
                        .text(user.getText())
                        .build());
        return true;
    }
}
