package com.yc.chapter_04.annotation;

import com.yc.chapter_02.xmlBean.CompactDisc3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    CompactDisc3 compactDisc3;

    @Autowired
    TrackCounter trackCounter;

    @Test
    public void test(){
        // 播放一些磁道
        compactDisc3.playTrack(1);
        compactDisc3.playTrack(1);
        compactDisc3.playTrack(2);
        compactDisc3.playTrack(2);
        compactDisc3.playTrack(2);
        compactDisc3.playTrack(3);


        // 获取播放次数
        System.out.println("轨道1：" + trackCounter.getPlayCount(1));
        System.out.println("轨道2：" + trackCounter.getPlayCount(2));
        System.out.println("轨道3：" + trackCounter.getPlayCount(3));
    }
}
