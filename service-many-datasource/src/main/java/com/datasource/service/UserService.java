package com.datasource.service;


import com.datasource.entity.UserCard;
import com.datasource.entity.UserT;
import com.datasource.entity.UserTo;

import java.util.List;

public interface UserService {

    /**
      * @Author:zxh
      * @Description:
      * @Date: 2019/3/5
      */
    public List<UserTo> findUserList(String userId);

    List<UserT> findUserListTo(String userId);

    List<UserCard> findUserListThree(String userId);
}
