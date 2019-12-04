package com.xlaser.junit.order;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * {@code MethodOrderer} that orders methods pseudo-randomly
 * 采用伪随机实现随机顺序,随机seed是利用 {@link System#nanoTime()}
 * <p>
 * 注意@Test注解使用junit5而不是junit4.
 *
 * @package: com.xlaser.junit.order
 * @author: Elijah.D
 * @time: 2019/12/4 10:28
 * @description: 测试case执行顺序
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@TestMethodOrder(MethodOrderer.Random.class)
public class RandomOrderTest {
    @Test
    public void testAC() {
        Console.log("Test 2");
    }

    @Test
    public void testBC() {
        Console.log("Test 3");
    }

    @Test
    public void testABC() {
        Console.log("Test 1");
    }
}
