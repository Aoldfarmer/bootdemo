package com.example.demo.ch3.annotation;

import com.example.demo.BaseLogger;
import org.springframework.stereotype.Service;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-18 上午 9:35
 */

@Service
public class DemoService extends BaseLogger {

    public void outputResult() {
        LOG.debug("从组合注解配置照样获得的bean:{}", this.getClass().getName());
    }
}
