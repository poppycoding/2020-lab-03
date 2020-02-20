package com.xlaser4j.junit.order;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * {@code MethodOrderer} that sorts methods alphanumerically based on their names using {@link String#compareTo(String)}.
 * 按照方法名字母顺序升序排列.
 * <p>
 * 注意@Test注解使用junit5而不是junit4.
 *
 * @package: com.xlaser4j.junit.order
 * @author: Elijah.D
 * @time: 2019/12/4 10:28
 * @description: 测试case执行顺序
 * @modified: Elijah.D
 */
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class AlphanumericOrderTest {
    @Test
    public void testAC() {
        Console.log("testAC");
    }

    @Test
    public void testBC() {
        Console.log("testBC");
    }

    @Test
    public void testABC() {
        Console.log("testABC");
    }
}
