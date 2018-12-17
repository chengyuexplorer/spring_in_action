package com.yc.chapter_04.annotation_aop;


import com.yc.chapter_02.xmlBean.BlankDisc;
import com.yc.chapter_02.xmlBean.CompactDisc3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc3 blankDisc(){
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt Peppers's Lonely Hearts Club Band!");
        blankDisc.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Pretty Boy");
        tracks.add("See you again");
        tracks.add("Fixing a Hole");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
