package com.controller;


import com.mapper.UserMapper;
import com.pojo.User;
import com.utils.ApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc：
 * @title：UserController
 * @author: huangwencai
 * @date: 2019-11-18 10:42
 * @version: v4.40.0
 */
@RestController
    public class UserController {
    @Autowired
    private UserMapper userMapper;



    @RequestMapping("/test")
    public String test(){
        User user=new User(1,"huangpan",30);
        userMapper.insert(null);
        Object o1=ApplicationContextUtil.getBean("userController");
        //Object o2=ApplicationContextUtil.getBean("userControllerss");//这里会抛出异常  "org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'userControllerss' available"
        return "aaa";
    }

}