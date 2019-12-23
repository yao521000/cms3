package com.briup.cms3.web.controller;

import com.briup.cms3.bean.Article;
import com.briup.cms3.dao.IArticleDao;
import com.briup.cms3.servie.IArticleService;
import com.briup.cms3.util.Message;
import com.briup.cms3.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/article")
@Api(description = "信息管理")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @PostMapping("/add")
    @ApiOperation(value = "新增信息",notes = "category.cdode category.name 不需要输入")
    public Message addArticle(Article article){
        articleService.addArticle(article);
        return MessageUtil.success();
    }

    @GetMapping("/delect")
    @ApiOperation("通过ID删除信息")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int",required = true)
    public Message delectByid(int id){
        articleService.delectById(id);
        return MessageUtil.success();
    }

    @GetMapping("/find")
    @ApiOperation("查找信息，通过Id")
    @ApiImplicitParam(name = "Id",value = "链接Id",paramType = "query",dataType = "int",required = true)
    public Message<Article> findByid(int id){
        Article article = articleService.findById(id);
        return MessageUtil.success(article);
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "查询全部信息")
    public Message findAll(){
        List<Article> list = articleService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改信息")
    public Message update(Article article){
        articleService.addArticle(article);
        return MessageUtil.success();
    }

}
