package com.yc.chapter_04.annotation;

/**
 * Encoreable接口的默认实现
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("执行DefaultEncoreable.performEncore()方法");
    }
}
