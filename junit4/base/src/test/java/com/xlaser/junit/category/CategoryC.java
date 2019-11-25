package com.xlaser.junit.category;

import cn.hutool.core.lang.Console;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @package: com.xlaser.junit.category
 * @author: Elijah.D
 * @time: 2019/11/25 10:41
 * @description: 测试categories注解在类上
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Category({FastTests.class, SmokeTests.class})
public class CategoryC {
    @Test
    public void testC() {
        Console.log("【testC】:{}", true);
    }
}
