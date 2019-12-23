package com.briup.cms3;

import com.briup.cms3.bean.Article;
import com.briup.cms3.servie.IArticleService;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cms3ApplicationTests {

    @Autowired
    private IArticleService articleService;

    @Test
    public void contextLoads() {
        Article article = articleService.findById(1);
        int id = article.getCategory().getId();
        String name = article.getCategory().getName();
        System.out.println(id + ":" + name);
    }

    @Test
    public void test1(){
        String ss = "";
        String ss1 = null;
        String ss2 = " ";
        System.out.println(StringUtils.isEmpty(ss));
        System.out.println(StringUtils.isEmpty(ss1));
        System.out.println(StringUtils.isEmpty(ss2));

        System.out.println(StringUtils.isBlank(ss));
        System.out.println(StringUtils.isBlank(ss1));
        System.out.println(StringUtils.isBlank(ss2));

        System.out.println(StringUtils.substring("21321312",2));
    }

}
