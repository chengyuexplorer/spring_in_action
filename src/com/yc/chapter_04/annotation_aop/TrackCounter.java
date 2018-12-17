package com.yc.chapter_04.annotation_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 切面：带参数
 *
 * 需求：播放cd时，记录每个磁道的播放次数
 */
@Aspect
public class TrackCounter {
    /**
     * 用map来记录磁道以及它对应的播放次数
     */
    private Map<Integer,Integer> trackCounts = new HashMap<>();

    /**
     * 定义切点
     *
     * 参数说明：当调用切点方法时，该方法的参数会通过参数传递过来，
     *           我们可以将参数读取后进行一系列操作
     */
    @Pointcut("execution(* com.yc.chapter_02.xmlBean.CompactDisc3.playTrack(int)) " + "&&args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    /**
     * 前置通知
     */
    @Before("trackPlayed(trackNumber)")
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
