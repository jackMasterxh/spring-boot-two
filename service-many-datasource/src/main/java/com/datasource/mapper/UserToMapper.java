package com.datasource.mapper;

import com.datasource.entity.UserTo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserToMapper {
    /**
      * @Author:zxh
      * @Description:
      * @Date: 2019/3/5
      */
    List<UserTo> findUserList();

    int deleteByPrimaryKey(@Param("userId") String id);

    int insert(UserTo record);

    int insertSelective(UserTo record);

    UserTo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserTo record);

    int updateByPrimaryKey(UserTo record);
}