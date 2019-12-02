package com.xlaser.junit.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @package: com.xlaser.junit.hamcrest
 * @author: Elijah.D
 * @time: 2019/12/2 9:49
 * @description: 测试匹配器框架
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class HamcrestTest {
    /**
     * 利用hamcrest创建方便创建一系列的匹配器,用于校验预期结果.
     *
     * @see org.hamcrest.CoreMatchers
     */
    @Test
    public void matcherAssertTest() {
        assertThat(plus(3, 5), equalTo(8));

        assertThat("Hello Hamcrest", containsString("Hello"));
        assertThat("Hello Hamcrest", containsString("Hello H"));

        assertThat("", notNullValue());

        assertThat(new NullPointerException(), isA(RuntimeException.class));
    }

    private int plus(int a, int b) {
        return a + b;
    }
}
