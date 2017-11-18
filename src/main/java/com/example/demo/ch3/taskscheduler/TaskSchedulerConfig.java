package com.example.demo.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-17 下午 20:45
 */
@Configuration
@ComponentScan("com.example.demo.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
