package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.DoorayMessageSender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class MessageSendServiceTest {
    @InjectMocks
    private MessageSendService messageSendService;
    @Mock
    private DoorayMessageSender doorayMessageSender;
    @Mock
    private User user;
    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void  testMessageSendServiceBeanInjection(){
        assertThat(messageSendService).isNotNull();

        assertThat(doorayMessageSender).isNotNull();
    }

    @Test
    void testDoorayMessageSender() {
        when(doorayMessageSender.sendMessage(user)).thenReturn(false);

        boolean actual = doorayMessageSender.sendMessage(user);

        assertThat(actual).isEqualTo(false);
    }

    @Test
    void testMessageService() {
        when(messageSendService.doSendMessage()).thenReturn(false);

        boolean actual = messageSendService.doSendMessage();

        assertThat(actual).isEqualTo(false);
    }
}