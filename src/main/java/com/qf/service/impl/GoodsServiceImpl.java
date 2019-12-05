package com.qf.service.impl;

import com.qf.dao.GoodsDao;
import com.qf.pojo.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao gdao;

    @Override
    public int fabu(Goods goods) {
        return gdao.fabu(goods);
    }

    @Override
    public Goods shops(int id) {
        return gdao.shops(id);
    }
}
