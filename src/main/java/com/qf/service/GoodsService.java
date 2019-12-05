package com.qf.service;

import com.qf.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {

    int fabu(Goods goods);

    //商品详情页
    Goods shops(int id);

    // 搜索
    List<Goods> findByGoodsname(String goodsname);

    //推荐
    // 最新
    /* List<Goods> findByCollect(Integer id);*/
    List<Goods> tuijian(String collect);
    List<Goods> zuixin(String gtime);
    // 分类
    List<Goods>  findByGno (Integer gno);
}
