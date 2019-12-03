package com.briup.cms3.web.controller;

import com.briup.cms3.bean.Link;

import com.briup.cms3.servie.ILinkService;

import com.briup.cms3.util.Message;
import com.briup.cms3.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/delect")
    @ApiOperation("根据ID，删除链接×")
    public Message delectLink(int id) {
        linkService.delectLink(id);
        return MessageUtil.success();
    }

}
