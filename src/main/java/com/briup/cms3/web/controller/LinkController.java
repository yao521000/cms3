package com.briup.cms3.web.controller;

import com.briup.cms3.bean.Link;

import com.briup.cms3.servie.ILinkService;

import com.briup.cms3.util.Message;
import com.briup.cms3.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/link")
@Api(description = "连接管理")
public class LinkController {

    @Autowired
    private ILinkService  linkService;


    @PostMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link) {
        linkService.addLink(link);
        return MessageUtil.success();
    }
}
