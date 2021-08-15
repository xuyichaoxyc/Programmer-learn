package org.xyc.springframework;

import org.junit.Test;
import org.xyc.springframework.bean.UserService;
import org.xyc.springframework.beans.factory.BeanFactory;
import org.xyc.springframework.beans.factory.config.BeanDefinition;
import org.xyc.springframework.beans.factory.support.DefaultListableBeanFactory;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registryBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean 从 singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
