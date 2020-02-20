package com.xlaser4j.junit.injection;

import org.junit.jupiter.api.*;

/**
 * @package: com.xlaser4j.junit.info
 * @author: Elijah.D
 * @time: 2019/12/4 12:26
 * @description: 注入TestInfo
 * @modified: Elijah.D
 */
class TestInfoTest {
    @BeforeEach
    void setup(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        System.out.printf("@BeforeEach %s %n", displayName);
    }

    @Test
    @DisplayName("Inject TestInfo")
    @Tag("Injection")
    void testOne(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
    }

    @Test
    void testTwo(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
    }
}
