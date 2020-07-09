package com.akamonk.demo.mapper;

import com.akamonk.demo.entity.User;

/**
 * @author Yu
 * @since 2020/7/3
 */
public interface UserMapper {
    User getUserByID(Integer id) throws Exception;
}
