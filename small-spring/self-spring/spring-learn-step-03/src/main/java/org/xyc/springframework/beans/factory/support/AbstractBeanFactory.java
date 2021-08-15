package org.xyc.springframework.beans.factory.support;

import org.xyc.springframework.beans.BeansException;
import org.xyc.springframework.beans.factory.BeanFactory;
import org.xyc.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
//        Object bean = getSingleton(name);
//        if (bean != null) {
//            return bean;
//        }
//
//        BeanDefinition beanDefinition = getBeanDefinition(name);
//        return createBean(name, beanDefinition);
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected  <T> T doGetBean(String name, Object... args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition, Object[] args) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;
}
