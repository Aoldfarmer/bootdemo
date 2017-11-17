package com.example.demo.ch3.taskexecutor;

import com.example.demo.BaseLogger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService extends BaseLogger {

    @Async
    public void executeAsyncTask(Integer i) {
        LOG.debug("异步执行任务： {}", i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        LOG.debug("异步执行任务+1： {}", i);
    }
}
