package com.bingo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主页控制器
 *
 * Created by bingo on 2018/6/18.
 */

@Controller
public class MainController {

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping(value = {"/login"})
    public String login() {
        return "login";
    }

    @GetMapping(value = {"/login-error"})
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登录失败");
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping(value = {"/search"})
    public String search() {
        return "search";
    }
}
