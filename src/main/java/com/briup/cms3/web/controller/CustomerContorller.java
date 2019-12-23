package com.briup.cms3.web.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerContorller {

    @PostMapping("/authenticaion/from")
    @ApiOperation("登录逻辑")
    public void login(String username, String password){



    }
}
