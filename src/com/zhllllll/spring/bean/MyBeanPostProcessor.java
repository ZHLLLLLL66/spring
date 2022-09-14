package com.zhllllll.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
这是一个后置处理器对象
必须要实现 BeanPostProcessor这个接口
* */
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 在init方法前
     *
     * @param bean     传入的在IOC容器中创建/配置Bean
     * @param beanName 传入的在IOC容器中创建/配置Bean的id
     * @return 程序员对传入的bean 进行修改/处理  返回
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization(Object bean, String beanName)........bean=" + bean + "  beanName=" + beanName);
        return bean;
    }

    /**
     * 在init方法后
     *
     * @param bean     传入的在IOC容器中创建/配置Bean
     * @param beanName 传入的在IOC容器中创建/配置Bean的id
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization(Object bean, String beanName)......bean=" + bean + "   beanName=" + beanName);
        return bean;
    }
}
