package com.bingo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户控制器
 *
 * Created by bingo on 2018/6/18.
 */

@Controller
@RequestMapping(value = {"/users"})
public class UserController {

    public String list() {
        return "users/list";
    }
}
