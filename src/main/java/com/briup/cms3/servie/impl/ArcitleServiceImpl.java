package com.briup.cms3.servie.impl;

import com.briup.cms3.bean.Article;
import com.briup.cms3.dao.IArticleDao;
import com.briup.cms3.exception.CustomerException;
import com.briup.cms3.servie.IArticleService;
import com.briup.cms3.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArcitleServiceImpl implements IArticleService {

    @Autowired
    private IArticleDao articleDao;

    @Override
    public void addArticle(Article article) throws CustomerException {
        if(article == null){
            throw new CustomerException(CodeUtil.BAD_CODE,"参数为空");
        }
        article.setClickTimes(0);
        article.setPublishDate(new Date());
        articleDao.save(article);
    }

    @Override
    public void delectById(int id) throws CustomerException {
        articleDao.deleteById(id);
    }

    @Override
    public Article findById(int id) throws CustomerException {
        return articleDao.queryById(id);
    }


    @Override
    public List<Article> findAll() throws CustomerException {
        return articleDao.findAll();
    }


}
