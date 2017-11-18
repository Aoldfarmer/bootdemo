package com.example.demo.ch3.conditional;

import com.example.demo.BaseLogger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author koou
 * @version 1.0
 * @since 2017-11-17 下午 23:19
 */
public class Main extends BaseLogger {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);
        LOG.debug("{}系统下的列表命令为：{}", context.getEnvironment().getProperty("os.name"), listService.showListCmd());

    }
}
