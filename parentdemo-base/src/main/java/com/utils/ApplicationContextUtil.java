package com.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @desc：
 * @title：ApplicationContextUtil
 * @author: huangwencai
 * @date: 2019-11-19 9:19
 * @version: v4.40.0
 */
//这个类就是项目启动的时候，就会运行：https://www.jianshu.com/p/4c0723615a52
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    public final static Object getBean(String beanName)
    {
        return context.getBean(beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("项目启动时候Application自动赋值给application"+applicationContext);
        ApplicationContextUtil.context = applicationContext;
    }
}