package com.yc.chapter_02.javaConfigBean;

/**
 * CD 播放器
 */
public class CDPlayer2 implements MediaPlayer2 {
    private CompactDisc2 compactDisc2;
    /**
     * 构造器注入
     * required = false：如果没有匹配的bean，该bean就会处于未装配状态，不推荐
     */
    public CDPlayer2(CompactDisc2 compactDisc2) {
        this.compactDisc2 = compactDisc2;
    }

    @Override
    public void play(){
        compactDisc2.play();
    }

}
