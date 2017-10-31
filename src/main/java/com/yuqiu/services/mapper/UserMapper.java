package com.yuqiu.services.mapper;

import com.yuqiu.common.annotation.MyBatisDao;
import com.yuqiu.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by dell on 2017/8/18.
 */
@MyBatisDao
public interface UserMapper {
    //登陆DAO
    public User doLogin(@Param("account") String account, @Param("password") String password) ;
}
