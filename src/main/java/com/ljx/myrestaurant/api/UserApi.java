package com.ljx.myrestaurant.api;

import com.github.pagehelper.PageInfo;
import com.ljx.myrestaurant.model.User;
import com.ljx.myrestaurant.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api")
public class UserApi {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("getUserAll")
    @ResponseBody
    public PageInfo<User> getUserAll(){
        return userService.findAllUser(1,10);
    }
}
