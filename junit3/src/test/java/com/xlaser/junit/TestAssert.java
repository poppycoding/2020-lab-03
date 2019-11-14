package com.xlaser.junit;

import junit.framework.TestCase;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/12 17:01
 * @description: 测试assert
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestAssert extends TestCase {
    /**
     * test boolean
     */
    public void testBoolean() {
        assertTrue(true);
        assertTrue("Asserts that a condition is true. If it isn't it throws an AssertionFailedError with the given message.", true);
        assertFalse(false);
        assertFalse("Asserts that a condition is true. If it isn't it throws an AssertionFailedError with the given message.", false);
    }

    /**
     * test equals
     */
    public void testEquals() {
        assertEquals(1, 1);
        assertEquals("Asserts that two ints are equal. If they are not an AssertionFailedError is thrown with the given message.", 1, 1);
    }
}
