package com.bingo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 后台管理控制器
 *
 * Created by bingo on 2018/6/18.
 */

@Controller
@RequestMapping(value = {"/admins"})
public class AdminController {

    /**
     * 获取博客后台首页
     * @param model
     * @return
     */
    @GetMapping
    public ModelAndView index(Model model) {
        return new ModelAndView("admins/index", "menuList", model);
    }
}
