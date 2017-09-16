package com.yss._other.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserControllerAop {

    @Pointcut("execution(public * com.yss.controller.*.*(..))")
    public void log() {
    }

    @Around("log()")
    public Object doAround(ProceedingJoinPoint pjp) {

        System.out.println("around=============");

        Object result = null;
        try {
            result = pjp.proceed();
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return null;
    }


}
