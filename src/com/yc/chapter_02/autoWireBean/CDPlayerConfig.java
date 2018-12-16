package com.yc.chapter_02.autoWireBean;

import org.springframework.context.annotation.ComponentScan;

/**
 * 配置类：默认开启组件扫描
 *
 * 说明：@ComponentScan，那么默认会
 *       扫描此配置类所在的package以及它的所有子包。
 */
@ComponentScan(basePackages = {"com.yc.chapter_02.autoWireBean"})
public class CDPlayerConfig {
}
