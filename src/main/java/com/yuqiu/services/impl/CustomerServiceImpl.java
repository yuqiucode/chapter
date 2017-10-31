package com.yuqiu.services.impl;

import com.yuqiu.model.User;
import com.yuqiu.services.mapper.UserMapper;
import com.yuqiu.services.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by dell on 2017/8/16.
 */
public class CustomerServiceImpl  implements CustomerService {
    private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public User doLogin(String account, String password){
        User user = userMapper.doLogin(account, password);
        if(user instanceof User)
            return user;
        return null;
    }

    @Override
    public List<User> getCustomerList(int begin, int end) {
        return null;
    }

    @Override
    public User getCustomer(long id){
        return null;
    }

    @Override
    public boolean creatCustomer(User user) {
        return false;
    }

    @Override
    public boolean updateCustomer(User user) {
        return false;
    }

    @Override
    public boolean delCustomer(long id) {
        return false;
    }

}
