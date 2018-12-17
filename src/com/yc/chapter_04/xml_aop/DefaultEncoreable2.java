package com.yc.chapter_04.xml_aop;

/**
 * Encoreable接口的默认实现
 */
public class DefaultEncoreable2 implements Encoreable2 {
    @Override
    public void performEncore() {
        System.out.println("执行DefaultEncoreable.performEncore()方法");
    }
}
