package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao udao;
    @Override
    public void fabu(String qq,String tel) {
        udao.fabu(qq,tel);
    }

    @Override
    public User shops(int uno) {
        return udao.shops(uno);
    }
}
