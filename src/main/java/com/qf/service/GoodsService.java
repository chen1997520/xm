package com.qf.service;

import com.qf.pojo.Goods;
import org.apache.ibatis.annotations.Param;

public interface GoodsService {

    int fabu(Goods goods);

    //商品详情页
    Goods shops(int id);

}
