package com.briup.cms3.web.controller;

import com.briup.cms3.bean.Link;

import com.briup.cms3.servie.ILinkService;

import com.briup.cms3.util.Message;
import com.briup.cms3.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;


@RestController
@RequestMapping("/link")
@Api(description = "连接管理")
public class LinkController {

    @Autowired
    private ILinkService  linkService;


    @PostMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link) {
        linkService.saveOrUpdate(link);
        return MessageUtil.success();
    }

    @GetMapping("/delect")
    @ApiOperation("根据ID，删除链接×")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message delectLink(int id) {
        linkService.delectLink(id);
        return MessageUtil.success();
    }

    @GetMapping("/select")
    @ApiOperation("根据ID，查询结果")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message<Link> fildById(int id){
        Link link = linkService.findById(id);
        return MessageUtil.success(link);
    }


    @PostMapping("/update")
    @ApiOperation("修改链接")
    public Message update(Link link) {
        linkService.saveOrUpdate(link);
        return MessageUtil.success();
    }

    @GetMapping("/findall")
    @ApiOperation("查询所以链接")
    public Message<List<Link>> findAll(){
        List<Link> list = linkService.findAll();
        return MessageUtil.success(list);
    }

}
