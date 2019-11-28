package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/27 14:27
 * @description: 简单测试
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class SimpleTest {
    @Test
    public void test1() {
        Console.log("【Test1】:{}", "true1");
    }

    @Test
    public void test2() {
        Console.log("【Test2】:{}", "true2");
    }

    @Test
    public void test3() {
        Console.log("【Test3】:{}", "true3");
    }

    @Test
    public void test4() {
        Console.log("【Test4】:{}", "true4");
    }

    @Test
    public void test5() {
        Console.log("【Test5】:{}", "true5");
    }
}
