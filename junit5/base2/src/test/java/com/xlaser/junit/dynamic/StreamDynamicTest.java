package com.xlaser.junit.dynamic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;

/**
 * @package: com.xlaser.junit.dynamic
 * @author: Elijah.D
 * @time: 2019/12/4 14:28
 * @description: 测试dynamic
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
class StreamDynamicTest {
    /**
     * 通过{@link DynamicTest#stream(Iterator, Function, ThrowingConsumer)}创建dynamicTest
     *
     * @return Stream<DynamicTest>
     */
    @TestFactory
    Stream<DynamicTest> streamTest() {
        // Preconditions.notNull(inputGenerator, "inputGenerator must not be null");
        Iterator<Integer> inputs = Arrays.asList(0, 2, 4).iterator();

        // Preconditions.notNull(displayNameGenerator, "displayNameGenerator must not be null");
        Function<Integer, String> names = (input) -> "Input: " + input;

        // Preconditions.notNull(testExecutor, "testExecutor must not be null");
        ThrowingConsumer<Integer> executor = (input) -> {
            System.out.println(input);
            assertEquals(0, input % 2);
        };

        // Return Stream<DynamicTest>
        return stream(inputs, names, executor);
    }
}
