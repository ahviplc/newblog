package com.bingo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 博客控制器
 *
 * Created by bingo on 2018/6/18.
 */

@Controller
@RequestMapping(value = {"/blogs"})
public class BlogController {

    /**
     * 获取博客列表，默认根据new进行排序
     * @param order 排序规则
     * @param tag 标签/keyword
     * @return
     */
    public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                            @RequestParam(value = "tag", required = false) Long tag) {

        System.out.println("order: " + order + "; tag: " + tag);
        return "redirect:/index?order=" + order + "&tag=" + tag;
    }
}
