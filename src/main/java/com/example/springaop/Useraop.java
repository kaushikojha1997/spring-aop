package com.example.springaop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Aspect
@Configuration
@EnableAspectJAutoProxy
@Slf4j
public class Useraop {
    @Before("execution(String index())")
    public void hello() {
        log.info("hello");
    }

    @After("execution(String index())")
    public void bye() {
        log.info("bye");
    }
}