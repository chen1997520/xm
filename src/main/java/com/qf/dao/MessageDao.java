package com.qf.dao;

import com.qf.pojo.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageDao {

    void mess(Message message);
}
