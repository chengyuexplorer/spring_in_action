package com.yc.chapter_04.annotation_aop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EncoeableConfig.class)
public class EncoreableTest {

    @Autowired
    Performance performance;

    @Test
    public void test(){
        performance.perform();
        // 先将原目标类型强转成新增的类型，然后调用相关的方法
        ((Encoreable)performance).performEncore();
    }
}
