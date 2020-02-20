package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * The default order of execution of JUnit tests within a class is deterministic but not predictable.
 * 默认的执行顺序是固定的,但是不可预测{@link MethodSorters#DEFAULT}
 * <p>
 * 常用的是{@link MethodSorters#NAME_ASCENDING}根据case名字按照字典顺序执行
 *
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/22 14:57
 * @description: 测试case的执行顺序
 * @modified: Elijah.D
 * @see org.junit.internal.MethodSorter
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFixMethodOrder {
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
