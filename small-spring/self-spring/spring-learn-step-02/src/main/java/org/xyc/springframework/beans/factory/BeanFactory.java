package org.xyc.springframework.beans.factory;

import org.xyc.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
