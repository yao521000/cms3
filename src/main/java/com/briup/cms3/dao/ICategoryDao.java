package com.briup.cms3.dao;


import com.briup.cms3.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,Integer> {
    Category queryById(int id);
}
