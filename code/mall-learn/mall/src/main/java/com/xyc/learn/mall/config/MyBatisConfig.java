package com.xyc.learn.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
// @MapperScan("com.xyc.learn.mall.mbg.mapper")
@MapperScan({"com.xyc.learn.mall.mbg.mapper", "com.xyc.learn.mall.dao"})
public class MyBatisConfig {

}

/**
 * @Configuration：
 * 用于定义配置类，可替换xml配置文件。被注解的类内部包含有一个或多个被@Bean注解的方法，
 * 这些方法将会被 AnnotationConfigApplicationContext 或 AnnotationConfigWebApplicationContext类
 * 进行扫描，并用于构建bean定义，初始化Spring容器。
 * @Configuration不可以是final类型； @Configuration不可以是匿名类；嵌套的configuration必须是静态类。
 * 用@Configuration加载Spring
 *
 **/