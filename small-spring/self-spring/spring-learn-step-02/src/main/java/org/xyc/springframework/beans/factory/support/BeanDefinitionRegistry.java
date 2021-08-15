package org.xyc.springframework.beans.factory.support;

import org.xyc.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
