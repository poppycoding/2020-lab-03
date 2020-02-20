package com.xlaser4j.junit.nested;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @package: com.xlaser4j.junit.nested
 * @author: Elijah.D
 * @time: 2019/12/3 17:27
 * @description: 利用nested模拟堆操作
 * @modified: Elijah.D
 */
@DisplayName("A stack test")
public class StackTest {
    public static Stack<String> stack;

    @BeforeAll
    @DisplayName("is instantiated")
    public static void setup() {
        stack = new Stack<>();
        System.out.println("setup");
    }

    private Object pop() {
        return stack.pop();
    }

    private Object peek() {
        return stack.peek();
    }

    /**
     * 设置case执行顺序
     */
    @Nested
    @DisplayName("when empty")
    @TestMethodOrder(MethodOrderer.Alphanumeric.class)
    public class WhenEmpty {
        @Test
        @DisplayName("is empty")
        public void isEmpty() {
            System.out.println(stack);
        }

        /**
         * {@link java.util.EmptyStackException  if this stack is empty.}
         */
        @Test
        @DisplayName("throws Exception when popped")
        public void throwsExceptionWhenPopped() {
            assertThrows(EmptyStackException.class, StackTest.this::pop);
        }

        /**
         * {@link java.util.EmptyStackException  if this stack is empty.}
         */
        @Test
        @DisplayName("throws Exception when peeked")
        public void throwsExceptionWhenPeeked() {
            assertThrows(EmptyStackException.class, StackTest.this::peek);
        }

        /**
         * 强制设置执行顺序,初始化stack之后,进行peek/pop测试
         */
        @Nested
        @DisplayName("after pushing an element")
        @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
        public class AfterPushing {
            @Test
            @Order(1)
            @DisplayName("it is pushing data")
            public void pushData() {
                stack.push("TEST1");
                stack.push("TEST2");
            }

            @Test
            @Order(2)
            @DisplayName("it is no longer empty")
            public void isNotEmpty() {
                System.out.println(stack);
            }

            @Test
            @Order(3)
            @DisplayName("returns the element when peeked")
            public void returnElementWhenPeeked() {
                assertAll("=========peek=========",
                        () -> assertEquals(2, stack.size()),
                        () -> assertEquals("TEST2", stack.peek()),
                        () -> assertEquals(2, stack.size()));
                System.out.println(stack);
            }

            @Test
            @Order(4)
            @DisplayName("returns the element when popped")
            public void returnElementWhenPopped() {
                assertAll("=========pop=========",
                        () -> assertEquals(2, stack.size()),
                        () -> assertEquals("TEST2", stack.pop()),
                        () -> assertEquals("TEST1", stack.peek()),
                        () -> assertEquals(1, stack.size()));
                System.out.println(stack);
            }
        }
    }
}