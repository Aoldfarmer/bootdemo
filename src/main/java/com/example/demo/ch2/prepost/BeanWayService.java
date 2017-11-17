package com.example.demo.ch2.prepost;

import com.example.demo.BaseLogger;


public class BeanWayService extends BaseLogger {

    public void init() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("@Bean-init-method");
        }
    }

    public BeanWayService() {
        super();
        LOG.debug("构造{}初始化函数", this.getClass().getName());
    }


    public void destroy() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("@Bean-destroy-method");
        }
    }
}
