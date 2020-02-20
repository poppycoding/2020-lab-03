package com.xlaser4j.junit.platform.suite;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

/**
 * 测试suite功能利用{@code @RunWith(JUnitPlatform.class)
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
