package com.yc.chapter_02.xmlBean;

import java.util.List;

/**
 * 用来演示将字面量注入到构造器中
 */
public class BlankDisc implements CompactDisc3 {
    private String title;
    private String artist;
    /**
     * 用来演示装配集合
     */
    private List<String> tracks;

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    /**
     * 根据磁道号，调用
     */
    @Override
    public void playTrack(int trackNumber) {
        System.out.println(tracks.get(trackNumber -1));
    }
}
