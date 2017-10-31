package com.yuqiu.services.service;


import java.io.Serializable;
import java.util.List;

import com.yuqiu.model.User;

/**
 * Created by dell on 2016/7/22.
 */
public interface CustomerService extends Serializable {
    /**
     * 登陆
     */
    public User doLogin(String account, String password) ;

    /**
     * 获取客户列表
     */
    public List<User> getCustomerList(int begin, int end);

    /**
     * 获取客户
     */
    public User getCustomer(long id);

    /**
     * 创建客户
     */
    public boolean creatCustomer(User user);

    /**
     * 更新客户
     */
    public  boolean updateCustomer(User user);


    /**
     * 删除客户
     */
    public boolean delCustomer(long id);
}
