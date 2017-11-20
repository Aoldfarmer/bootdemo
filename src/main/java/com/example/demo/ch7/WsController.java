package com.example.demo.ch7;

import com.example.demo.ch3.taskscheduler.ScheduledTaskService;
import com.example.demo.ch7.domain.WiselyMessage;
import com.example.demo.ch7.domain.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-20 下午 21:18
 */
@Controller
public class WsController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome:" + message.getName() + "!");
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("wyf")) {
            simpMessagingTemplate.convertAndSendToUser("wisely",
                    "/queue/notifications", principal.getName() + "-send:" + msg);
        } else {
            simpMessagingTemplate.convertAndSendToUser("wyf",
                    "/queue/notifications", principal.getName() + "-send:" + msg);
        }
    }
}
