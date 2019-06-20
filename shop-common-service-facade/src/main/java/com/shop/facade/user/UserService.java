package com.shop.facade.user;

import com.shop.entity.user.UserEntity;
import com.shop.req.user.LoginReq;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
