package com.yc.chapter_04.annotation_aop;

/**
 * 目标对象的实现类
 */
public class PerformanceImpl implements Performance {

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
