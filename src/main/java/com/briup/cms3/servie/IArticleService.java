package com.briup.cms3.servie;

import com.briup.cms3.bean.Article;
import com.briup.cms3.exception.CustomerException;

import java.util.List;


public interface IArticleService {
    void addArticle (Article article) throws CustomerException;

    void delectById (int id) throws CustomerException;

    Article findById (int id) throws CustomerException;

    List<Article> findAll() throws CustomerException;
}
