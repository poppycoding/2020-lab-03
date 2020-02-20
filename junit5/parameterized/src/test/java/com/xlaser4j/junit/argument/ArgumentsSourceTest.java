package com.xlaser4j.junit.argument;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ArgumentsSources;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @package: com.xlaser4j.junit.argument
 * @author: Elijah.D
 * @time: 2019/12/5 13:00
 * @description:
 * @modified: Elijah.D
 */
class ArgumentsSourceTest {
    /**
     * 测试一个arguments的数据源
     *
     * @param one
     * @param two
     * @param three
     */
    @ParameterizedTest
    @ArgumentsSource(CustomProviderA.class)
    @DisplayName("ArgumentsSourceTest: A")
    void testSource(String one, String two, int three) {
        assertAll("Parameterized Test: CustomProviderA",
                () -> assertEquals("Hello", one),
                () -> assertThat(two, StringContains.containsString("Arguments")),
                () -> assertTrue(three > 6660));
    }

    /**
     * 测试多个arguments的数据源
     *
     * @param one
     * @param two
     * @param three
     */
    @ParameterizedTest
    @ArgumentsSources({@ArgumentsSource(CustomProviderA.class), @ArgumentsSource(CustomProviderB.class)})
    @DisplayName("ArgumentsSourcesTest: A & B")
    void testSources(String one, String two, int three) {
        assertAll("Parameterized Test: CustomProviderA & B",
                () -> assertThat(one, StringContains.containsString("H")),
                () -> assertThat(two, StringContains.containsString("Arguments")),
                () -> assertTrue(8883 > three & three > 6660));
    }
}
