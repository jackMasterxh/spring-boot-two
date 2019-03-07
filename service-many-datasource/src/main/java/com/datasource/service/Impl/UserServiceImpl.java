package com.datasource.service.Impl;

import com.datasource.entity.UserCard;
import com.datasource.entity.UserT;
import com.datasource.entity.UserTo;
import com.datasource.mapper.custom.UserTMapper;
import com.datasource.mapper.master.UserToMapper;
import com.datasource.mapper.three.UserCardMapper;
import com.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zxh
 * @Description:
 * @Date: 2019/3/5
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserToMapper userMapper;

    @Autowired
    private UserTMapper userTMapper;
    @Autowired
    private UserCardMapper userCardMapper;

    /**
      * @Author:zxh
      * @Description:
      * @Date: 2019/3/5
      */
    @Override
    public List<UserTo> findUserList(String userId) {
        if (userId == null) {
          return   userMapper.findUserList();
        }else {
            ArrayList<UserTo> objects = new ArrayList<>();
            UserTo user = userMapper.selectByPrimaryKey(userId);
            objects.add(user);
            return objects;
        }
    }

    @Override
    public List<UserT> findUserListTo(String userId) {
        ArrayList<UserT> objects = new ArrayList<>();
        UserT user = userTMapper.selectByPrimaryKey(Integer.parseInt(userId));
        objects.add(user);
        return objects;
    }

    @Override
    public List<UserCard> findUserListThree(String userId) {
        ArrayList<UserCard> objects = new ArrayList<>();
        UserCard user = userCardMapper.selectByPrimaryKey(Integer.parseInt(userId));
        objects.add(user);
        return objects;
    }
}
