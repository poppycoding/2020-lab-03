package com.xlaser.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/19 18:21
 * @description: 测试constructor参数化
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(Parameterized.class)
public class TestParameterizedConstructor {
    private int inputOne;

    private int inputTwo;

    private int sum;

    /**
     * 通过构造确定参数个数顺序,不匹配则抛出异常
     *
     * @param inputOne 数值1
     * @param inputTwo 数值2
     * @param sum      和
     */
    public TestParameterizedConstructor(int inputOne, int inputTwo, int sum) {
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
        this.sum = sum;
    }

    /**
     * <pre>
     * {index} - the current parameter index
     * {0} - the first parameter value
     * {1} - the second parameter value
     * etc...
     * </pre>
     *
     * @return 数据源
     */
    @Parameters(name = "inputOne = {0}, inputTwo = {1}, sum = {2}")
    public static Collection<Object[]> dataSource() {
        return Arrays.asList(new Object[][]{{1, 1, 2}, {2, 2, 4}, {3, 3, 6}});
    }

    @Test
    public void testSum() {
        assertEquals(inputOne + " + " + inputTwo + " is not " + sum, inputOne + inputTwo, sum);
    }
}
