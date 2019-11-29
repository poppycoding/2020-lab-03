package com.xlaser.junit.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/29 16:30
 * @description: test exception
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ExceptionTest {
    @Test
    public void exceptionTest() {

        Exception e = assertThrows(NullPointerException.class, () -> {
            throw new NullPointerException("Test NPE!");
        });

        assertEquals("Test NPE!", e.getMessage());
    }
}
