package com.xlaser.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/20 16:11
 * @description: 测试parameterized
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(Parameterized.class)
public class TestParameterized {
    /**
     * 通过注解确定参数顺序从0开始依次递增
     */
    @Parameter
    public int inputOne;

    @Parameter(1)
    public int inputTwo;

    @Parameter(2)
    public int sum;

    /**
     * <pre>
     * Default value is "{index}" for compatibility with previous JUnit versions.
     * {index} - the current parameter index
     * {0} - the first parameter value
     * {1} - the second parameter value
     * etc...
     * </pre>
     *
     * @return 数据源
     */
    @Parameters(name = "{index}: {0} + {1} = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{1, 1, 2}, {2, 2, 4}, {3, 3, 6}});
    }

    @Test
    public void testSum() {
        assertEquals(inputOne + "+" + inputTwo + " is not " + sum, inputOne + inputTwo, sum);
    }
}
