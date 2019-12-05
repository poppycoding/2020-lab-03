package com.xlaser.junit.enumeration;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * {@code @EnumSource} is an {@link org.junit.jupiter.params.provider.ArgumentsSource} for constants
 * 枚举也是一种数据源通过{@code org.junit.jupiter.params.provider.EnumArgumentsProvider}创建stream枚举
 * <p>
 * eg: constants.stream().map(Arguments::of)
 *
 * @package: com.xlaser.junit.enumeration
 * @author: Elijah.D
 * @time: 2019/12/5 15:27
 * @description: 枚举类数据源
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
class EnumSourceTest {
    /**
     * 枚举类
     *
     * @param argument
     */
    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void testTime(TimeUnit argument) {
        System.out.println(argument + ": " + argument.getClass());
        assertNotNull(argument);
    }

    /**
     * 自定义枚举
     *
     * @param argument
     */
    @ParameterizedTest
    @EnumSource(Season.class)
    void testSeason(Season argument) {
        System.out.println(argument + ": " + argument.getClass());
        assertNotNull(argument);
    }

    /**
     * {@code ArgumentConverter} is applied to the method parameter of a {@link ParameterizedTest}
     * method with the help of a {@link org.junit.jupiter.params.converter.ConvertWith} annotation.
     * <p>
     * 参数化测试过程中,可以通过继承SimpleArgumentConverter实现对象的转换
     * <p>
     * 也可以通过{@link org.junit.jupiter.params.provider.ValueSource}隐式调用转换
     *
     * @param argument
     * @see com.xlaser.junit.value.ValueSourceTest#testWithImplicitConversionToBoolean(Boolean)
     */
    @ParameterizedTest
    @EnumSource(Season.class)
    void testSeasonConvert(@ConvertWith(StringArgumentConvert.class) String argument) {
        System.out.println(argument + ": " + argument.getClass());
        assertNotNull(argument);
    }

    /**
     * 根据名字做匹配过滤{@link EnumSource.Mode#mode()}默认是include
     * <p>
     * eg: include
     *
     * @param argument
     */
    @ParameterizedTest
    @EnumSource(value = Season.class, mode = EnumSource.Mode.INCLUDE, names = {"SPRING", "AUTUMN"})
    void testSeasonInclude(Season argument) {
        System.out.println("INCLUDE MODE: " + argument + argument.getClass());
        assertNotNull(argument);
    }

    /**
     * 根据名字做匹配过滤{@link EnumSource.Mode#mode()}默认是include
     * <p>
     * eg: exclude
     *
     * @param argument
     */
    @ParameterizedTest
    @EnumSource(value = Season.class, mode = EnumSource.Mode.EXCLUDE, names = {"SPRING", "AUTUMN"})
    void testSeasonExclude(Season argument) {
        System.out.println("EXCLUDE MODE: " + argument + argument.getClass());
        assertNotNull(argument);
    }

    /**
     * 根据名字做匹配过滤{@link EnumSource.Mode#mode()}默认是include
     * <p>
     * eg: match_all/match_any
     * 这里两种效果一样,因为stream().allMatch和stream().anyMatch单个都是返回true
     *
     * @param argument
     */
    @ParameterizedTest
    @EnumSource(value = Season.class, mode = EnumSource.Mode.MATCH_ALL, names = "^S.+")
    void testSeasonAll(Season argument) {
        System.out.println("MATCH_ALL MODE: " + argument + " " + argument.getClass());
        assertNotNull(argument);
    }
}
