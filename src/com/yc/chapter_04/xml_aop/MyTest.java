package com.yc.chapter_04.xml_aop;


import com.yc.chapter_02.xmlBean.BlankDisc;
import com.yc.chapter_02.xmlBean.CompactDisc3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yc/chapter_04/xml_aop/applicationContext.xml");
        Performance2 performance2 = (Performance2) context.getBean("performanceImpl2");
        performance2.perform();
        System.out.println("=================================");
        performance2.perform2();
        System.out.println("=================================");

        CompactDisc3 compactDisc3 = (CompactDisc3) context.getBean("blankDisc");
        compactDisc3.playTrack(1);
        compactDisc3.playTrack(1);
        compactDisc3.playTrack(2);
        compactDisc3.playTrack(2);
        compactDisc3.playTrack(2);
        compactDisc3.playTrack(3);

        TrackCounter2 trackCounter2 = (TrackCounter2) context.getBean("trackCounter2");
        System.out.println(trackCounter2.getPlayCount(1));
        System.out.println(trackCounter2.getPlayCount(2));
        System.out.println(trackCounter2.getPlayCount(3));

    }
}
