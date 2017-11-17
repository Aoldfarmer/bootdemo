package com.example.demo.ch2.prepost;

import com.example.demo.BaseLogger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService extends BaseLogger {

    @PostConstruct
    public void init() {
        LOG.debug("{} method init", this.getClass().getName());
    }

    public JSR250WayService() {
        super();
        LOG.debug("初始化{}构造函数", this.getClass().getName());
    }

    @PreDestroy
    public void destroy() {
        LOG.debug("{} method destroy", this.getClass().getName());
    }
}
