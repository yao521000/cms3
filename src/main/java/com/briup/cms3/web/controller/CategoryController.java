package com.briup.cms3.web.controller;


import com.briup.cms3.bean.Category;
import com.briup.cms3.servie.ICategoryService;
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
@RequestMapping("/category")
@Api(description = "栏目管理")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/add")
    @ApiOperation("添加栏目")
    public Message saveOrupdatecategory(Category category){
        categoryService.saveOrUpdateCategory(category);
        return MessageUtil.success();
    }

    @GetMapping("/delete")
    @ApiOperation("删除栏目")
    @ApiImplicitParam(name = "id",value = "栏目ID",paramType = "query",dataType = "int",required = true)
    public Message delete(int id){
        categoryService.deleteCategory(id);
        return MessageUtil.success();
    }

    @GetMapping("/find")
    @ApiOperation("查找栏目，通过ID")
    @ApiImplicitParam(name = "id",value = "栏目ID",paramType = "query",dataType = "int",required = true)
    public Message<Category>findById(int id){
        Category category = categoryService.queryById(id);
        return MessageUtil.success(category);
    }

    @GetMapping("/findAll")
    @ApiOperation("查找全部栏目")
    public Message<List<Category>> findAll(){
        List<Category> list = categoryService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("/update")
    @ApiOperation("修改栏目")
    public Message saveOrUpdate(Category category){
        categoryService.saveOrUpdateCategory(category);
        return MessageUtil.success();
    }


}
