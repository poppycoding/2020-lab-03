package com.xlaser4j.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:35
 * @description: service
 * @modified: Elijah.D
 */
@Service
public class MsgService {
    @Autowired
    private MsgDao dao;

    public String getMsg() {
        return dao.getMessage();
    }
}
