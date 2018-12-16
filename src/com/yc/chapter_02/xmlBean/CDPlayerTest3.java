package com.yc.chapter_02.xmlBean;

import com.yc.chapter_02.autoWireBean.MediaPlayer;
import com.yc.chapter_02.javaConfigBean.CDPlayerConfig2;
import com.yc.chapter_02.javaConfigBean.CompactDisc2;
import com.yc.chapter_02.javaConfigBean.MediaPlayer2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 *
 * 说明：@ContextConfiguration()：指明配置类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig2.class)
public class CDPlayerTest3 {

     @Test
     public void test(){
         ApplicationContext context = new ClassPathXmlApplicationContext("com/yc/chapter_02/xmlBean/applicationContext.xml");
         MediaPlayer3 mediaPlayer3 = (MediaPlayer3) context.getBean("cdPlayer3");
         mediaPlayer3.play();

         CompactDisc3 compactDisc3 = (CompactDisc3) context.getBean("sgtPeppers3");
         compactDisc3.play();

         BlankDisc blankDisc = (BlankDisc) context.getBean("blankDisc");
         blankDisc.play();

     }
}
