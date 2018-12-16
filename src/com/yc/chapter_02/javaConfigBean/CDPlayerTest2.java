package com.yc.chapter_02.javaConfigBean;

import com.yc.chapter_02.autoWireBean.CDPlayerConfig;
import com.yc.chapter_02.autoWireBean.CompactDisc;
import com.yc.chapter_02.autoWireBean.MediaPlayer;
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
@ContextConfiguration(classes = CDPlayerConfig2.class)
public class CDPlayerTest2 {

    @Autowired
    private CompactDisc2 compactDisc2;

    @Autowired
    private MediaPlayer2 mediaPlayer2;

    @Test
    public void cdShouldNotBeNull(){
        System.out.println(compactDisc2);
        compactDisc2.play();
    }

    @Test
    public void testPlayer(){
        mediaPlayer2.play();
    }
}
