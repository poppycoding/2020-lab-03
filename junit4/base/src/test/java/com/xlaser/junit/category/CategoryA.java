package com.xlaser.junit.category;

import cn.hutool.core.lang.Console;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @package: com.xlaser.junit.category
 * @author: Elijah.D
 * @time: 2019/11/25 10:17
 * @description: 测试categories注解在方法上
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class CategoryA {
    @Category({FastTests.class})
    @Test
    public void testFA() {
        Console.log("【testFA】:{}", true);
    }

    @Category(SlowTests.class)
    @Test
    public void testSL() {
        Console.log("【testSL】:{}", true);
    }

    @Category(SmokeTests.class)
    @Test
    public void testST() {
        Console.log("【testST】:{}", true);
    }

    @Category({FastTests.class, SmokeTests.class})
    @Test
    public void testFS() {
        Console.log("【testFS】:{}", true);
    }

    @Test
    public void testT() {
        Console.log("【testT】:{}", true);
    }
}
