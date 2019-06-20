package com.shop.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shop.entity.user.UserEntity;
import com.shop.facade.user.UserService;
import com.shop.req.user.LoginReq;
import com.shop.rsp.Result;

import javax.servlet.http.HttpServletResponse;

public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;


    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);
        return null;
    }
}
