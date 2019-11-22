package com.xlaser.junit;

import org.junit.Test;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/22 16:16
 * @description: 测试assume
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestAssume {
    /**
     * If called with an expression evaluating to {@code false}, the test will halt and be ignored.
     */
    @Test
    public void testTrue() {
        assumeTrue(true);
    }

    /**
     * 当预期结果不匹配时,停止并忽略这个测试
     */
    @Test
    public void testFalse() {
        // This test will be skipped
        assumeFalse(true);
    }
}
