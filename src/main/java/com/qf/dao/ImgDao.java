package com.qf.dao;

import com.qf.pojo.Img;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImgDao {
    Img shops(@Param("no")int no);
}
