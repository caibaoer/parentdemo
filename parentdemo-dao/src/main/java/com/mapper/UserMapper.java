package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @desc：
 * @title：UserMapper
 * @author: huangwencai
 * @date: 2019-11-18 16:23
 * @version: v4.40.0
 */

@Mapper
public interface UserMapper {
    void insert (User user);
}