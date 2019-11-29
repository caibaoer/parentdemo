package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @desc：
 * @title：ArrayConfig
 * @author: huangwencai
 * @date: 2019-11-29 8:25
 * @version: v4.40.0
 */
@Component(value = "arrayConfig")
@ConfigurationProperties(prefix = "array-demo")
public class ArrayConfig {
    private Object [] li=new Integer[3];

    public Object[] getLi() {
        return li;
    }

    public void setLi(Object[] li) {
        this.li = li;
    }
}