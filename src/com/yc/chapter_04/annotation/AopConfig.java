package com.yc.chapter_04.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 *
 * EnableAspectJAutoProxy：启用AspectJ自动代理
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {


    /**
     * 为切面注册bean
     */
    @Bean
    public Audience audience(){
        return new Audience();
    }

    /**
     * 环绕通知 切面 bean
     */
    @Bean
    public Audience2 audience2(){
        return new Audience2();
    }

    @Bean
    public Performance performanceImpl(){
        return new PerformanceImpl();
    }











}
