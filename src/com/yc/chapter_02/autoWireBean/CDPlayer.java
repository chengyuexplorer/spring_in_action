package com.yc.chapter_02.autoWireBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CD 播放器
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;
    /**
     * 构造器注入
     * required = false：如果没有匹配的bean，该bean就会处于未装配状态，不推荐
     */
    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play(){
        compactDisc.play();
    }

//    /**
//     * setter注入
//     */
//    @Autowired
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }
}
