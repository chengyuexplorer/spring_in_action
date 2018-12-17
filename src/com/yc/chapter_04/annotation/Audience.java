package com.yc.chapter_04.annotation;

import org.aspectj.lang.annotation.*;

/**
 * 观众：对于表演而言，观众就是就是一个单独的关注点
 *
 * 定义为切面
 */
@Aspect
public class Audience {

    /**
     * 定义切点
     */
    @Pointcut("execution(* com.yc.chapter_04.annotation.Performance.perform(..))")
    public void performance(){}

    /**
     * 前置通知：在表演之前，保持手机静音
     */
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }
    /**
     * 前置通知：在表演之前，找位置坐下
     */
    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    /**
     * 返回通知：当成功执行之后，鼓掌
     */
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    /**
     * 异常通知：抛出异常之后
     */
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
