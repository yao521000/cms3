package com.briup.cms3.servie;

import com.briup.cms3.bean.Link;
import com.briup.cms3.exception.CustomerException;

import java.util.List;

public interface ILinkService {
    void saveOrUpdate(Link link) throws CustomerException;

    void delectLink(int id) throws CustomerException;

    Link findById(int id) throws CustomerException;

    List<Link> findAll() throws CustomerException;


}
