package com.shop.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.shop.entity.user.UserEntity;
import com.shop.facade.user.UserService;
import com.shop.req.user.LoginReq;


@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        return null;
    }
}
