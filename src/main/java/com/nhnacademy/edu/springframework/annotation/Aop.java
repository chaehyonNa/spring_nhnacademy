package com.nhnacademy.edu.springframework.annotation;

import com.nhnacademy.edu.springframework.domain.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class Aop {
    @Pointcut("execution(* com.nhnacademy.edu.springframework.sender.MessageSender.sendMessage(..)) &&  args(user, ..)")
    private void messageSenderCut(User user) {}

    @Around("messageSenderCut(user)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint, User user) throws Throwable {
        StopWatch stopWatch = new StopWatch();
//        Object[] args = new Object[]{new User("new@naver.com","010-2251-1234"),"HiTV"};
        try{
            stopWatch.start();
            return proceedingJoinPoint.proceed();
        } catch (Throwable th){
            throw th;
        }
        finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
