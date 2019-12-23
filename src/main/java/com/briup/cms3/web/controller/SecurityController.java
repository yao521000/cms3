package com.briup.cms3.web.controller;

import com.briup.cms3.util.Message;
import com.briup.cms3.util.MessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class SecurityController {

    @GetMapping("/authenticaion/login")
    public Message log(){
        return MessageUtil.error(403,"该用户没有登录，请跳转到等领域页面");

    }
}
