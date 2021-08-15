package org.xyc.springframework.beans.factory.support;

import org.xyc.springframework.beans.BeansException;
import org.xyc.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
