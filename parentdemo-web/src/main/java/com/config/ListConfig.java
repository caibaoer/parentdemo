package com.config;

import com.pojo.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc：
 * @title：ArrayConfig
 * @author: huangwencai
 * @date: 2019-11-29 8:25
 * @version: v4.40.0
 */
@Component(value = "listConfig")
@ConfigurationProperties(prefix = "list-demo")
public class ListConfig {

    private List<User> userList=new ArrayList<User>();

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}