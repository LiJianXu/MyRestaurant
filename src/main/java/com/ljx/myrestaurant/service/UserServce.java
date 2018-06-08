package com.ljx.myrestaurant.service;

import com.github.pagehelper.PageInfo;
import com.ljx.myrestaurant.model.User;

public interface UserServce {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
