package com.briup.cms3.servie;

import com.briup.cms3.bean.Category;
import com.briup.cms3.exception.CustomerException;

import java.util.List;

public interface ICategoryService {

    void saveOrUpdateCategory (Category category) throws CustomerException;

    void deleteCategory (int id) throws CustomerException;

    Category queryById(int id) throws  CustomerException;

    List<Category> findAll() throws  CustomerException;


}
