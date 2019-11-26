package com.xlaser.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:38
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BootTest {
    @Autowired
    private MsgService service;

    @Test
    public void test() {
        Assert.assertEquals("Hello world!", service.getMsg());
    }
}
