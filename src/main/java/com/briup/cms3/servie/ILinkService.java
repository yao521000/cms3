package com.briup.cms3.servie;

import com.briup.cms3.bean.Link;
import com.briup.cms3.exception.CustomerException;

public interface ILinkService {
    void addLink(Link link) throws CustomerException;
}
