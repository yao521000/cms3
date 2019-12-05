package com.briup.cms3.servie.impl;

import com.briup.cms3.bean.Category;
import com.briup.cms3.dao.ICategoryDao;
import com.briup.cms3.exception.CustomerException;
import com.briup.cms3.servie.ICategoryService;
import com.briup.cms3.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategroyServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    public void saveOrUpdateCategory(Category category) throws CustomerException {
        if (category ==null){
            throw new CustomerException(CodeUtil.BAD_CODE,"参数为空");
        }
        categoryDao.save(category);
    }

    @Override
    public void deleteCategory(int id) throws CustomerException {
        categoryDao.deleteById(id);
    }

    @Override
    public Category queryById(int id) throws CustomerException {
        return categoryDao.queryById(id);
    }



    @Override
    public List<Category> findAll() throws CustomerException {
        return categoryDao.findAll();
    }
}
