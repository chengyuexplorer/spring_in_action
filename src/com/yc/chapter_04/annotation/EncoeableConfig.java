package com.yc.chapter_04.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class EncoeableConfig {

    /**
     * 被通知的bean
     */
    @Bean
    public Performance performanceImpl(){
        return new PerformanceImpl();
    }

    /**
     * 定义切面bean
     */
    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }
}
