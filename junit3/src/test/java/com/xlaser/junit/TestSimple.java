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
public class TestSimple extends TestCase {
    /**
     * Sets up the fixture, for example, open a network connection.
     * <p>
     * 测试执行之前调用
     */
    @Override
    protected void setUp() {
        Console.log("<Setup>");
    }

    // Phase 4: Teardown (for each test)
    @Override
    protected void tearDown() throws Exception {
        Console.log("</Ending>");
    }

    // Test 1
    public void testSuccess() {
        // Phase 2: Simulation of exercise
        int expected = 60;
        int real = 60;
        Console.log("** Test 1 **");

        // Phase 3: Verify
        assertEquals(expected + " should be equals to " + real, expected, real);
    }

    // Test 2
    public void testFailure() {
        // Phase 2: Simulation of exercise
        int expected = 20;
        int real = 20;
        Console.log("** Test 2 **");

        // Phase 3: Verify
        assertEquals(expected + " should be equals to " + real, expected, real);
    }
}
