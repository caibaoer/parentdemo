package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @desc：
 * @title：UserMapper
 * @author: huangwencai
 * @date: 2019-11-18 16:23
 * @version: v4.40.0
 */
/**
 *  这里如果不要@Mapper注解,那么必须在启动类上面加扫描注解@MapperScan(basePackages = "com.mapper")  或者在
 *  applicationContext.xml配置：
 *  Mapper接口所在包名，Spring会自动查找其下的Mapper
 *     <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
 *         <property name="basePackage" value="com.cmcc.iot.bomp.mapper"/>
 *         <property name="sqlSessionTemplateBeanName" value="sqlSessionSimple"/>
 *     </bean>
 *    .xml文件在配置文件application.yml里面有相应配置
 *    mybatis:
 *    mapper-locations: classpath:mapper/*.xml
 */
@Mapper
@Component  //不加@Component也可以，不加的话，controller里面引用的时候会显示错误，其实可以不用管，是可以的。加上的话就不会显示错误。
public interface UserMapper {
    void insert (User user);
}