package com.shop.controller.user;

import com.shop.req.user.LoginReq;
import com.shop.rsp.Result;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

public interface UserController {
    /**
     * 登录
     * @param loginReq 登录请求参数
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */
    @GetMapping("/login")
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
