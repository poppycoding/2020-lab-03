package com.xlaser.junit.platform.suite;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

/**
 * 测试suite功能利用{@code @RunWith(JUnitPlatform.class)
 *
 * @package: com.xlaser.junit.suite
 * @author: Elijah.D
 * @time: 2019/11/22 15:40
 * @description: 测试suit数据
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestSuiteOne {
    @Test
    public void test1() {
        System.out.println("** Test 1 ***");
        assertTrue(true);
    }
}
