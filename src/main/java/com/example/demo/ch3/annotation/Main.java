package com.example.demo.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-18 上午 9:38
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
