package com.xlaser4j.junit;

import org.springframework.stereotype.Component;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:34
 * @description: dao
 * @modified: Elijah.D
 */
@Component
public class MsgDao {
    public String getMessage() {
        return "Hello world!";
    }
}
