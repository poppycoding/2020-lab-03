package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/22 15:19
 * @description: ignore可以添加到某个方法, 也可以添加到类上(测试未通过??)
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestIgnore {
    @Test
    public void test1() {
        Console.log("【1】:{}", true);
    }

    @Ignore
    @Test
    public void test2() {
        Console.log("【2】:{}", true);
        // This test will be skipped!
    }

    @Ignore("Test3 not ready yet!")
    @Test
    public void test3() {
        Console.log("【3】:{}", true);
        // This test will be skipped!
    }
}
