package com.pengjieran.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by Aaron on 2016/4/12.
 */
public class BeanUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        applicationContext = applicationContext;
    }

    public static <T> T getBean(String beanName) {

        return (T) applicationContext.getBean(beanName);
    }

    public void addBean(String beanName, Class<?> beanClass, Map<String, Object> map) {

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(beanClass);

        Set<Map.Entry<String, Object>> entries = map.entrySet();

        if (null != map && !map.isEmpty()) {

            for (Map.Entry entry : entries) {

                beanDefinitionBuilder.addPropertyValue((String) entry.getKey(), entry.getValue());
            }
        }

        if (beanClass.getName().equalsIgnoreCase("DruidDataSource")) {

            beanDefinitionBuilder.setInitMethodName("init");
            beanDefinitionBuilder.setDestroyMethodName("close");
        }

        registerBean(beanName, beanDefinitionBuilder.getRawBeanDefinition());

    }

    private void registerBean(String beanName, BeanDefinition beanDefinition) {

        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) applicationContext;
        BeanDefinitionRegistry beanDefinitonRegistry = (BeanDefinitionRegistry) configurableApplicationContext.getBeanFactory();
        beanDefinitonRegistry.registerBeanDefinition(beanName, beanDefinition);
    }

}