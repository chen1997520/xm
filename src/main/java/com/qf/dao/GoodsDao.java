package com.qf.dao;

import com.qf.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsDao {

    //发布二货
    int fabu(Goods goods);

    //商品详情页
    Goods shops(@Param("id")int id);

}
