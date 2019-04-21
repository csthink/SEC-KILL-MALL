package com.csthink.seckill.controller;

import com.csthink.seckill.domain.User;
import com.csthink.seckill.result.Result;
import com.csthink.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "hello world";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "jack");
        return "hello";
    }

    @RequestMapping("/db/get")
    @ResponseBody
    public Result<User> doGet() {
        User user = userService.getById(1);
        return Result.success(user);
    }

    @RequestMapping("/db/tx")
    @ResponseBody
    public Result<Boolean> doTx() {
        userService.tx();
        return Result.success(true);
    }
}
