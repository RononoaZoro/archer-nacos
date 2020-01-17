package org.example.service.impl;

import org.example.dao.UserMapper;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {this.userMapper = userMapper;}

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}