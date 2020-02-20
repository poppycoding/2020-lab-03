package com.xlaser4j.junit.method;

import java.util.stream.LongStream;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * @package: com.xlaser4j.junit.method
 * @author: Elijah.D
 * @time: 2019/12/5 17:32
 * @description: 数据源
 * @modified: Elijah.D
 */
public class DataSource {
    /**
     * 测试多参数数据源
     *
     * @return
     */
    static Stream<Arguments> multiProvider() {
        return Stream.of(arguments("Mastering", 10), arguments("JUnit 5", 20));
    }

    /**
     * 测试对象数据源
     *
     * @return
     */
    static Stream<Person> personProvider() {
        Person john = new Person("John", "Doe");
        Person jane = new Person("Jane", "Roe");
        return Stream.of(john, jane);
    }

    /**
     * 测试简单类型数据源
     *
     * @return
     */
    static LongStream longProvider() {
        return LongStream.of(4L, 5L);
    }

    /**
     * 测试简单类型数据源
     *
     * @return
     */
    static Stream<String> stringProvider() {
        return Stream.of("hello", "world");
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Person {
        String name;

        String surname;
    }
}
