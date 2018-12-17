package com.yc.chapter_04.xml_aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 定义切面：环绕通知
 */
public class Audience3 {

    public void watchPerformance(ProceedingJoinPoint pj){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("taking seats");
            pj.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }

    }
}
