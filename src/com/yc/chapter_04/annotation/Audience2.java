package com.yc.chapter_04.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面：
 *
 * 环绕通知
 */
@Aspect
public class Audience2 {

    /**
     * 定义切点
     */
    @Pointcut("execution(* com.yc.chapter_04.annotation.Performance.perform2(..))")
    public void performance2(){}

    /**
     * 环绕通知
     */
    @Around("performance2()")
    public void watchPerformance(ProceedingJoinPoint pj){
        try {
            System.out.println("Silencing cell phones2");
            System.out.println("Taking seats2");
            pj.proceed();
            System.out.println("CLAP CLAP CLAP!!!2");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund2");
        }

    }
}
