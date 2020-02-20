package com.xlaser4j.junit.standard;

import org.junit.jupiter.api.*;

/**
 * @package: com.xlaser4j.junit.standard
 * @author: Elijah.D
 * @time: 2019/12/3 10:59
 * @description: junit5
 * @modified: Elijah.D
 */
public class LifecycleJUnit5Test {
    /**
     * 在整个测试类开始时执行仅一次
     */
    @BeforeAll
    public static void setupAll() {
        System.out.println("Setup ALL TESTS in the class");
    }

    /**
     * 在整个测试类结束后执行仅一次
     */
    @AfterAll
    public static void teardownAll() {
        System.out.println("Teardown ALL TESTS in the class");
    }

    /**
     * 在每个case前执行一次
     */
    @BeforeEach
    public void setup() {
        System.out.println("Setup EACH TEST in the class");
    }

    @Test
    public void testOne() {
        System.out.println("TEST 1");
    }

    @Test
    public void testTwo() {
        System.out.println("TEST 2");
    }

    /**
     * 在每个case后执行一次
     */
    @AfterEach
    public void teardown() {
        System.out.println("Teardown EACH TEST in the class");
    }
}
