package com.nhnacademy.edu.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspect {
    @Pointcut("execution(* com.nhnacademy.edu.springframework.sender.DoorayMessageSender.sendMessage(..))")
    private void cut() {}

    @Around("cut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable {
        StopWatch stopWatch = new StopWatch();

        try{
            stopWatch.start();
            Object reslut = proceedingJoinPoint.proceed();
            return reslut;
        }finally {
            stopWatch.stop();
            System.out.println("["+proceedingJoinPoint.getSignature().getDeclaringTypeName() + "].[" +proceedingJoinPoint.getSignature().getName()+ "]["
                    + stopWatch.getTotalTimeMillis()+"]ms");
        }
    }
}
