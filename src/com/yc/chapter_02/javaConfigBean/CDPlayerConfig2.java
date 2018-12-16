package com.yc.chapter_02.javaConfigBean;

import com.yc.chapter_02.autoWireBean.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类：java配置类，用于注册bean
 *
 * 说明：1.@Configuration：表明这是一个配置类，它包含在Spring上下文中如何创建bean的细节
 *       2.@Bean：该注解会告诉Spring这个方法会返回一个对象，该对象要注册为Spring应用上下文中的bean
 *
 * 补充：
 *
 */
@Configuration
public class CDPlayerConfig2 {

    @Bean
    public CompactDisc2 sgtPeppers2(){
        return new SgtPeppers2();
    }

    /**
     * 以参数的方式优点：CompactDisc2 bean的创建可以不在同一个配置类中，甚至可以是别的装配方式
     */
    @Bean
    public CDPlayer2 cdPlayer(CompactDisc2 compactDisc2){
        return new CDPlayer2(compactDisc2);
    }

}
