package com.qf.service;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    void fabu(String qq,String tel);

    User shops(int id) ;
}
