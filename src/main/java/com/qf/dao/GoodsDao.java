package com.qf.dao;

import com.qf.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {

    //发布二货
    int fabu(Goods goods);

    //商品详情页
    Goods shops(@Param("id")int id);

    // 搜索
    List<Goods> findByGoodsname(String goodsname);
    //推荐
    // 最新
    /* List<Goods> findByCollect(String value);*/
    List<Goods> tuijian(String collect);
    List<Goods> zuixin(String gtime);
    // 分类
    List <Goods> findByGno(Integer gno);
}
