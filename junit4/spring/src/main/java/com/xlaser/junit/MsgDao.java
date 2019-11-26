package com.xlaser.junit;

import org.springframework.stereotype.Component;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:23
 * @description: dao
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Component
public class MsgDao {
    public String getMessage() {
        return "Hello world!";
    }
}
