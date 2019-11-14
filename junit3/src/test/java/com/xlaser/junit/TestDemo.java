package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import junit.framework.TestCase;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/12 17:09
 * @description: 测试样例
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestDemo extends TestCase {
    /**
     * Sets up the fixture, for example, open a network connection.
     * <p>
     * 测试执行之前setUp初始化
     */
    @Override
    protected void setUp() {
        Console.log(".........Setup............");
    }

    /**
     * Tears down the fixture, for example, close a network connection.
     * <p>
     * 测试之后执行tearDown销毁
     */
    @Override
    protected void tearDown() {
        Console.log(".........tearDown.........");
    }

    /**
     * case1
     */
    public void testSuccess() {
        int expected = 60;
        int real = 60;
        Console.log("success");

        assertEquals(expected + " should be equals to " + real, expected, real);
    }

    /**
     * case2
     */
    public void testFailure() {
        int expected = 20;
        int real = 20;
        Console.log("failed");

        assertEquals(expected + " should be equals to " + real, expected, real);
    }
}
