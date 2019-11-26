package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.UserService;
import com.itrip.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User userLogin(String userCode) {

        return  userMapper.selectByUserCode(userCode);
    }
}
