package com.yc.chapter_02.autoWireBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 *
 * 说明：@ContextConfiguration()：指明配置类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        System.out.println(compactDisc);
        compactDisc.play();
    }

    @Test
    public void testPlayer(){
        mediaPlayer.play();
    }
}
