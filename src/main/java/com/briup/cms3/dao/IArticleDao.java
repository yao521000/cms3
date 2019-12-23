package com.briup.cms3.dao;

import com.briup.cms3.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleDao extends JpaRepository<Article,Integer> {
    Article queryById(int id);
}
