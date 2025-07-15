package com.javaclimb.drug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户相关的controller
 */
@Controller
public class UserController {

    /**
     * 转向登录页面
     */
    @RequestMapping(value = "login")
    public String login(){
        return "/login";
    }
}
