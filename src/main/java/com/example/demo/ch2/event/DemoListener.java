package com.example.demo.ch2.event;

import com.example.demo.BaseLogger;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener extends BaseLogger implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        LOG.debug("我（bean-demoListener）接收到了bean-demoPublisher发布的消息: {}", msg);
    }
}
