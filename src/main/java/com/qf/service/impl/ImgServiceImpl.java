package com.qf.service.impl;

import com.qf.dao.ImgDao;
import com.qf.pojo.Img;
import com.qf.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    private ImgDao idao;

    @Override
    public Img shops(int id) {

        return idao.shops(id);
    }
}
