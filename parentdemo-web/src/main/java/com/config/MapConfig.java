package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc：
 * @title：ArrayConfig
 * @author: huangwencai
 * @date: 2019-11-29 8:25
 * @version: v4.40.0
 */
@Component(value = "mapConfig")
@ConfigurationProperties(prefix = "map-demo")
public class MapConfig {
    Map<String,Object> myMap=new HashMap<>();

    public Map<String, Object> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }
}