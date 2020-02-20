package com.xlaser4j.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

/**
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/16 12:57
 * @description: 测试rule
 * @modified: Elijah.D
 */
public class TestNameOfRule {
    /**
     * TestName Rule makes the current test name available inside test methods:
     * <p>
     * 测试用例中可以通过testName获取当前testName
     */
    @Rule
    public TestName name = new TestName();

    @Test
    public void testA() {
        assertEquals("testA", name.getMethodName());
    }

    @Test
    public void testB() {
        assertEquals("testB", name.getMethodName());
    }
}
