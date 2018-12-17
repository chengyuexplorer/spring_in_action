package com.yc.chapter_04.xml_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 切面：带参数
 *
 * xml版
 *
 * 需求：播放cd时，记录每个磁道的播放次数
 */
@Aspect
public class TrackCounter2 {
    /**
     * 用map来记录磁道以及它对应的播放次数
     */
    private Map<Integer,Integer> trackCounts = new HashMap<>();

    public void trackPlayed(int trackNumber){}


    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount + 1);
    }

    /**
     * 获取磁道的播放次数
     */
    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)? trackCounts.get(trackNumber) : 0;
    }
}
