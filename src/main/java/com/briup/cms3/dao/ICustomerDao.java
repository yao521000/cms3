package com.briup.cms3.dao;

import com.briup.cms3.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDao extends JpaRepository<Customer,Integer> {

    Customer queryByUsername(String username);
}
