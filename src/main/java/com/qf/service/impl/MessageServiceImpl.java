package com.qf.service.impl;

import com.qf.dao.MessageDao;
import com.qf.pojo.Message;
import com.qf.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao mdao;
    @Override
    public void mess(Message message) {
        mdao.mess(message);
    }
}
