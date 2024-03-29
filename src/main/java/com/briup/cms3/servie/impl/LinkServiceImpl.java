package com.briup.cms3.servie.impl;

import com.briup.cms3.bean.Link;
import com.briup.cms3.dao.ILinkDao;
import com.briup.cms3.exception.CustomerException;
import com.briup.cms3.servie.ILinkService;
import com.briup.cms3.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LinkServiceImpl implements ILinkService {

    @Autowired
    private ILinkDao linkDao;

    @Override
    public void saveOrUpdate(Link link) throws CustomerException {
        if (link == null){
            throw new CustomerException(CodeUtil.BAD_CODE,"参数为空");
        }
        linkDao.save(link);
    }

    @Override
    public void delectLink(int id) throws CustomerException {
        linkDao.deleteById(id);
    }

    @Override
    public Link findById(int id) throws CustomerException {
        return linkDao.queryById(id);
    }

    @Override
    public List<Link> findAll() throws CustomerException {
        return linkDao.findAll();
    }

}
