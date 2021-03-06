package com.blaife.service.impl;

import com.blaife.mapper.UserMapper;
import com.blaife.model.User;
import com.blaife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Blaife
 * @description TODO
 * @data 2020/4/30 16:59
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByName(String name) {
        return userMapper.findUserByName(name);
    }
}
