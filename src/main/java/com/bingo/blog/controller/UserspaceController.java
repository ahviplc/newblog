package com.bingo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

/**
 * 用户主页空间控制器
 *
 * Created by bingo on 2018/6/18.
 */

@Controller
@RequestMapping(value = {"/u"})
public class UserspaceController {

    @GetMapping(value = {"/{username}"})
    public String userSpace(@PathVariable("username") String username) {
        System.out.println("username:" + username);
        return "/userspace/u";
    }


    @GetMapping(value = {"/{username}/blogs"})
    public String listBlogsByOrder(@PathVariable("username") String username,
                                   @RequestParam(value = "order", required = false, defaultValue = "new") String order,
                                   @RequestParam(value = "category", required = false) Long category,
                                   @RequestParam(value = "keyword", required = false) String keyword) {
        if (category != null) {
            // 分类不为空
            System.out.print("category:" + category );
            System.out.print("selflink:" + "redirect:/u/" + username + "/blogs?category=" + category);
            return "/userspace/u";

        } else if (!StringUtils.isEmptyOrWhitespace(keyword)) {
            // keyword不为空或空格
            System.out.print("keyword:" + keyword );
            System.out.print("selflink:" + "redirect:/u/" + username + "/blogs?keyword=" + keyword);
            return "/userspace/u";
        }

        System.out.print("order:" + order);
        System.out.print("selflink:" + "redirect:/u/" + username + "/blogs?order=" + order);
        return "/userspace/u";
    }

    /**
     * 查找某个id的博客
     * @param id
     * @return
     */
    @GetMapping(value = {"/{username}/blogs/{id}"})
    public String getBlog(@PathVariable("id") Long id) {
        System.out.println("blogId:" + id);
        return "/userspace/blog";
    }

    @GetMapping(value = {"/{username}/blogs/edit"})
    public String editBlog() {
        return "/userspace/blogedit";
    }
}
