package com.yc.chapter_04.annotation_aop;


/**
 * 为所有的实现Performance接口的类添加下面的接口
 *
 * 需求：为目标类增加方法：通过代理的方式
 */
public interface Encoreable {
    void performEncore();
}
