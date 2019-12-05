package com.qf.service.impl;

import com.qf.dao.GoodsDao;
import com.qf.pojo.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    /* 搜索*/
    @Override
    public List<Goods> findByGoodsname(String goodsname) {
        return gdao.findByGoodsname("%"+goodsname+"%");
    }
   /* 推荐*/
    @Override
    public List<Goods> tuijian(String collect) {
        return gdao.tuijian(collect);
    }
    /*最新*/
    @Override
    public List<Goods> zuixin(String gtime) {
        return gdao.zuixin(gtime);
    }
    /* 分类*/
    @Override
    public List<Goods> findByGno(Integer gno) {
        return gdao.findByGno(gno);
    }
}
