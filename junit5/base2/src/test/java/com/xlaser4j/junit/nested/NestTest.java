package com.xlaser4j.junit.nested;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser4j.junit.nested
 * @author: Elijah.D
 * @time: 2019/12/3 17:19
 * @description: junit5嵌套测试
 * @modified: Elijah.D
 */
@SuppressWarnings("InnerClassMayBeStatic")
public class NestTest {
    @BeforeEach
    public void setup() {
        System.out.println("Setup 1");
    }

    @Test
    public void oneTest() {
        System.out.println("Test 1");
    }

    @Nested
    public class NestedTwoTest {
        @BeforeEach
        public void setup() {
            System.out.println("Setup 2");
        }

        @Test
        public void twoTest() {
            System.out.println("Test 2");
        }

        /**
         * test class, and nesting can be arbitrarily deep
         * 可以任意嵌套n层
         */
        @Nested
        public class NestedThreeTest {
            @BeforeEach
            public void setup() {
                System.out.println("Setup 3");
            }

            @Test
            public void threeTest() {
                System.out.println("Test 3");
            }
        }
    }
}
