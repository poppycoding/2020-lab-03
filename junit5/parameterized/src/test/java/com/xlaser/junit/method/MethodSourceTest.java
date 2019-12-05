package com.xlaser.junit.method;

import java.util.stream.IntStream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@code @MethodSource} is an {@link org.junit.jupiter.params.provider.ArgumentsSource} which
 * provides access to values returned from {@linkplain org.junit.jupiter.params.provider.MethodSource#value()
 * factory methods} of the class in which this annotation is declared or from static factory methods
 * in external classes referenced by <em>fully qualified method name</em>.
 * 工厂方法数据源,来自于一个静态的工厂方法,同类中的方法,直接写方法名,不在同一个类的写全限定名,获取value数据源
 *
 * @package: com.xlaser.junit.method
 * @author: Elijah.D
 * @time: 2019/12/5 17:25
 * @description: 通过method提供数据源
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
class MethodSourceTest {
    static IntStream intProvider() {
        return IntStream.of(0, 1);
    }

    /**
     * 同类之中,直接写方法名
     *
     * @param argument
     */
    @ParameterizedTest
    @MethodSource("intProvider")
    void testIntProvider(int argument) {
        assertTrue(argument >= 0);
    }

    /**
     * 不在同类中,写全限定名
     *
     * @param argument
     */
    @ParameterizedTest
    @MethodSource("com.xlaser.junit.method.DataSource#longProvider")
    void testLongProvider(long argument) {
        assertTrue(argument >= 0);
    }

    /**
     * 不在同类中,写全限定名
     *
     * @param argument
     */
    @ParameterizedTest
    @MethodSource("com.xlaser.junit.method.DataSource#stringProvider")
    void testStringProvider(String argument) {
        assertNotNull(argument);
    }

    /**
     * 多参数测试
     *
     * @param first
     * @param second
     */
    @ParameterizedTest
    @MethodSource("com.xlaser.junit.method.DataSource#multiProvider")
    void testMultiProvider(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    /**
     * 测试对象数据源
     *
     * @param argument
     */
    @ParameterizedTest
    @MethodSource("com.xlaser.junit.method.DataSource#personProvider")
    void testPersonProvider(DataSource.Person argument) {
        System.out.println("Parameterized test with (Person) argument: " + argument);
        assertNotNull(argument);
    }
}
