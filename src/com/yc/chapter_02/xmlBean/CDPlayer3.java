package com.yc.chapter_02.xmlBean;

/**
 * CD 播放器
 */
public class CDPlayer3 implements MediaPlayer3 {
    private CompactDisc3 compactDisc3;
    /**
     * 构造器注入
     * required = false：如果没有匹配的bean，该bean就会处于未装配状态，不推荐
     */
    public CDPlayer3(CompactDisc3 compactDisc3) {
        this.compactDisc3 = compactDisc3;
    }

    @Override
    public void play(){
        compactDisc3.play();
    }

}
