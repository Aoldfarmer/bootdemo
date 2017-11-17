package com.example.demo.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

    private static final Logger LOG = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(com.example.demo.ch1.aop.Action)")
    public void annotationPointCut() {

    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint
                .getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        LOG.debug("注解式拦截：{}", action.name());
    }

    @Before("execution(* com.example.demo.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint
                .getSignature();
        Method method = signature.getMethod();
        LOG.debug("方法式拦截：{}", method.getName());
    }
}
