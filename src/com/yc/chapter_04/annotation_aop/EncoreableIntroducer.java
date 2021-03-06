package com.yc.chapter_04.annotation_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 切面：为目标类添加新的接口方法
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.yc.chapter_04.annotation_aop.Performance+",defaultImpl = DefaultEncoreable.class)
    private static Encoreable encoreable;
}
