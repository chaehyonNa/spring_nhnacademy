package com.nhnacademy.edu.springframework.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class Aop {
    @Pointcut("execution(* com.nhnacademy.edu.springframework.service.MessageSendService.doSendMessage(..))")
    private void cut() {}

    @Before("cut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        StopWatch stopWatch = new StopWatch();

        try{
            stopWatch.start();
            proceedingJoinPoint.getThis();
            proceedingJoinPoint.getTarget();
            stopWatch.stop();
        }finally {
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
