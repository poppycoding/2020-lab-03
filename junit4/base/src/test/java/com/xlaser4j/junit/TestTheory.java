package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * The Theories runner then executes your test method as many times as the number of data points
 * declared, providing a different data point as the input argument on each invocation.
 * 这是一组动态测试场景方法,标记类@RunWith(Theories.class)然后提供dataPoint,标有@Theory的测试用例会对dataPoint
 * 中的数据进行排列组合测试,覆盖各种场景(因为接近于科学理论的测试方法而得名)
 *
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/22 16:19
 * @description: 测试Theory
 * @modified: Elijah.D
 */
@RunWith(Theories.class)
public class TestTheory {
    /**
     * 提供point正数集合
     *
     * @return data
     */
    @DataPoints
    public static int[] positiveIntegers() {
        return new int[]{1, 10, 100};
    }

    /**
     * 测试不存在负数
     *
     * @param a numA
     * @param b numB
     */
    @Theory
    public void testSum(int a, int b) {
        Console.log("Checking " + a + " + " + b);
        assertTrue(a + b > a);
        assertTrue(a + b > b);
    }
}
