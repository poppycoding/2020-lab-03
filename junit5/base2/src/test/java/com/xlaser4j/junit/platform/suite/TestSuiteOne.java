package com.xlaser4j.junit.platform.suite;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

/**
 * 测试suite功能利用{@code @RunWith(JUnitPlatform.class)
 *
 * @package: com.xlaser4j.junit.suite
 * @author: Elijah.D
 * @time: 2019/11/22 15:40
 * @description: 测试suit数据


 * @modified: Elijah.D
 */
public class TestSuiteOne {
    @Test
    public void test1() {
        System.out.println("** Test 1 ***");
        assertTrue(true);
    }
}
