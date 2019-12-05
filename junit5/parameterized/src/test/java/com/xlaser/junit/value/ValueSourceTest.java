package com.xlaser.junit.value;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @package: com.xlaser.junit.value
 * @author: Elijah.D
 * @time: 2019/12/5 17:01
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ValueSourceTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void testWithInts(int argument) {
        assertTrue(argument >= 0);
    }

    @ParameterizedTest
    @ValueSource(longs = {2L, 3L})
    void testWithLongs(long argument) {
        assertTrue(argument > 1);
    }

    @ParameterizedTest
    @ValueSource(doubles = {4d, 5d})
    void testWithDoubles(double argument) {
        assertTrue(argument > 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void testWithStrings(String argument) {
        assertNotNull(argument);
    }

    /**
     * 通过{@code org.junit.jupiter.params.provider.ValueArgumentsProvider}默认转换对应的类型
     * <p>
     * 也可以自定义转换类型,实现自定义转换{@link com.xlaser.junit.enumeration.StringArgumentConvert}
     *
     * @param argument
     */
    @ParameterizedTest
    @ValueSource(strings = "true")
    public void testWithImplicitConversionToBoolean(Boolean argument) {
        assertTrue(argument);
    }

    @ParameterizedTest
    @ValueSource(strings = "11")
    void testWithImplicitConversionToInteger(Integer argument) {
        assertTrue(argument > 10);
    }

    @ParameterizedTest
    @ValueSource(strings = "SECONDS")
    void testWithImplicitConversionToEnum(TimeUnit argument) {
        assertNotNull(argument.name());
    }

    @ParameterizedTest
    @ValueSource(strings = "2017-07-25")
    void testWithImplicitConversionToLocalDate(LocalDate argument) {
        assertNotNull(argument);
    }
}
