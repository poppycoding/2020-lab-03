package com.xlaser4j.junit.suite;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * 测试suite{@link org.junit.runner.RunWith#value()}
 *
 * @package: com.xlaser4j.junit.suite
 * @author: Elijah.D
 * @time: 2019/11/22 16:01
 * @description:


 * @modified: Elijah.D
 */
public class TestSuiteTwo {
    @Test
    public void test2() {
        System.out.println("## Test 2 ##");
        assertTrue(true);
    }
}
