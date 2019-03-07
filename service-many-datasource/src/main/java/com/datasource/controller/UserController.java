package com.datasource.controller;


import com.datasource.entity.UserCard;
import com.datasource.entity.UserT;
import com.datasource.entity.UserTo;
import com.datasource.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:zxh
 * @Description: controller
 * @Date: 2019/3/5
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping(value = "/findUserList",method = RequestMethod.GET)
    public List<UserTo> findUserList(String userId){
        return userService.findUserList(userId);
    }

    @RequestMapping(value = "/findUserListTo",method = RequestMethod.GET)
    public List<UserT> findUserListTo(String userId){
        return userService.findUserListTo(userId);
    }

    @RequestMapping(value = "/findUserListThree",method = RequestMethod.GET)
    public List<UserCard> findUserListThree(String userId){
        return userService.findUserListThree(userId);
    }

}
