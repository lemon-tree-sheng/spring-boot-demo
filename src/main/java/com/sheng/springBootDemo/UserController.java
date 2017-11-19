package com.sheng.springBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shengxingyue, created on 2017/11/19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @ResponseBody
    public String queryUserInfo() {
        return "sheng";
    }
}
