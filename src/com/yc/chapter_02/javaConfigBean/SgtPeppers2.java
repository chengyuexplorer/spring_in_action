package com.yc.chapter_02.javaConfigBean;

/**
 * CD的一种具体实现，即一种具体的CD
 */
public class SgtPeppers2 implements CompactDisc2 {

    private String title = "Sgt Peppers's Lonely Hearts Club Band!";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
