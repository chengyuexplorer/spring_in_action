package com.yc.chapter_02.xmlBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 * 说明：@ContextConfiguration()：指明配置类
 */
public class CDPlayerTest3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yc/chapter_02/xmlBean/applicationContext.xml");
        MediaPlayer3 mediaPlayer3 = (MediaPlayer3) context.getBean("cdPlayer3");
        mediaPlayer3.play();

        CompactDisc3 compactDisc3 = (CompactDisc3) context.getBean("sgtPeppers3");
        compactDisc3.play();

        BlankDisc blankDisc = (BlankDisc) context.getBean("blankDisc");
        blankDisc.play();
    }

}
