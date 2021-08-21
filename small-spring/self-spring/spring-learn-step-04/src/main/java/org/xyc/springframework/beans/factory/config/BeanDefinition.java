package org.xyc.springframework.beans.factory.config;

public class BeanDefinition {

    private Class beanClass;



    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
