package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    void fabu(@Param("qq")String qq,@Param("tel")String tel);

    User shops(@Param("id")int id) ;
}
