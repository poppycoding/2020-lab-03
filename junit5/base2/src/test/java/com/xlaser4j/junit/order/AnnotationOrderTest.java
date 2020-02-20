package com.xlaser4j.junit.order;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * {@code MethodOrderer} that sorts methods based on the {@link Order @Order} annotation.
 * 开启注解排序后,会根据case上的order值进行执行,默认是{@link Integer#MAX_VALUE}优先级最低,值越小优先级越高.
 * <p>
 * 注意@Test注解使用junit5而不是junit4.
 *
 * @package: com.xlaser4j.junit.order
 * @author: Elijah.D
 * @time: 2019/12/4 10:28
 * @description: 测试case执行顺序
 * @modified: Elijah.D
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AnnotationOrderTest {
    @Test
    @Order(1)
    public void testAC() {
        Console.log("testAC");
    }

    @Test
    @Order(2)
    public void testBC() {
        Console.log("testBC");
    }

    @Test
    @Order(3)
    public void testABC() {
        Console.log("testABC");
    }
}
