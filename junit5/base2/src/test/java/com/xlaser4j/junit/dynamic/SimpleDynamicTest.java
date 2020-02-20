package com.xlaser4j.junit.dynamic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * @package: com.xlaser4j.junit.dynamic
 * @author: Elijah.D
 * @time: 2019/12/4 14:10
 * @description: 测试dynamic
 * @modified: Elijah.D
 */
class SimpleDynamicTest {
    /**
     * must return a Stream, Collection, Iterable, Iterator, Array of {@link org.junit.jupiter.api.DynamicNode}
     * 使用{@code @TestFactory}注解必须返回上述集合类,否则报错.
     *
     * @return
     */
    @Disabled("return invalid return type")
    @TestFactory
    List<String> returnError() {
        return Arrays.asList("Hello", "Dynamic");
    }

    @TestFactory
    Stream<DynamicTest> dynamicStream() {
        return Stream
                .of("A", "B", "C")
                .map(o -> dynamicTest("Dynamic: " + o, () -> System.out.println("Testing " + o)));
    }

    @TestFactory
    Collection<DynamicTest> dynamicCollection() {
        return Arrays.asList(
                dynamicTest("1st", () -> assertTrue(true)),
                dynamicTest("2nd", () -> assertEquals(4, 2 * 2)));
    }

    @TestFactory
    Iterable<DynamicTest> dynamicIterable() {
        return Arrays.asList(
                dynamicTest("3rd", () -> assertTrue(true)),
                dynamicTest("4th", () -> assertEquals(4, 2 * 2)));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicIterator() {
        return Arrays.asList(
                dynamicTest("5th", () -> assertTrue(true)),
                dynamicTest("6th", () -> assertEquals(4, 2 * 2))
        ).iterator();
    }
}
