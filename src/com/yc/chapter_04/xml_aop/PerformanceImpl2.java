package com.yc.chapter_04.xml_aop;

/**
 * 目标对象的实现类
 */
public class PerformanceImpl2 implements Performance2 {

    @Override
    public void perform() {
        System.out.println("执行PerformanceImpl.perform()方法");
    }

    @Override
    public void perform2() {
        int a = 1/0;
        System.out.println("执行PerformanceImpl.perform2()方法");
    }
}
