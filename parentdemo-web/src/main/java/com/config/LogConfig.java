package com.config;

import com.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc：
 * @title：LogConfig
 * @author: huangwencai
 * @date: 2019-11-28 17:26
 * @version: v4.40.0
 */
@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    /**
     *https://www.cnblogs.com/feiyu127/p/7700090.html
     *@Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。添加的bean的id为方法名
     * 自定义bean的命名
     * 默认情况下bean的名称和方法名称相同，你也可以使用name属性来指定
     *  @Bean(name = "myUser")
     *     public User logMethod() {
     *         LOG.info("==========print log==========");
     *         return new User();
     *     }
     */
    @Bean
    public User logMethod() {
        LOG.info("==========print log==========");
        return new User();
    }
}