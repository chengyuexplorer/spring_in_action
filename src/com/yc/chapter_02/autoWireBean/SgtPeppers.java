package com.yc.chapter_02.autoWireBean;

import org.springframework.stereotype.Component;

/**
 * CD的一种具体实现，即一种具体的CD
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt Peppers's Lonely Hearts Club Band!";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
