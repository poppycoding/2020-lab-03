package com.xlaser.junit.assertion;

import java.time.Duration;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

/**
 * @package: com.xlaser.junit.assertion
 * @author: Elijah.D
 * @time: 2019/11/29 18:17
 * @description: 测试超时timeout
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TimeoutTest {
    /**
     * 超时测试,测试参数
     */
    @Test
    void timeoutNotExceeded() {
        assertTimeout(ofMinutes(2), () -> Console.log("【timeoutNotExceeded】"));
    }

    /**
     * 超时测试,测试方法
     */
    @Test
    void timeoutNotExceededWithMethod() {
        assertTimeout(ofMinutes(2), Person::test, "Test method!");
    }

    /**
     * 超时测试,执行完之后再计算超时时间,不同于preemptive到设定时间直接终止程序,执行结果查看输出start-end
     * {@link org.junit.jupiter.api.Assertions#assertTimeoutPreemptively(Duration, Executable)}
     */
    @Test
    @Disabled("Ignore timeoutExceedTest just for test timeout!")
    void timeoutExceedTest() {
        assertTimeout(ofMillis(10), () -> {
            Console.log("【start======timeoutExceedTest======】");
            Thread.sleep(20);
            Console.log("【end======timeoutExceedTest======】");
        });
    }

    /**
     * 超时测试,到设定超时间后直接终止程序,不同于上面的assertTimeout必定执行完程序,执行结果查看仅仅输出start
     * {@link org.junit.jupiter.api.Assertions#assertTimeout(Duration, Executable)} (Duration, Executable)}
     */
    @Test
    @Disabled("Ignore timeoutExceedPreemptivelyTest just for test timeout!")
    void timeoutExceedPreemptivelyTest() {
        assertTimeoutPreemptively(ofMillis(10), () -> {
            Console.log("【start======timeoutExceedPreemptivelyTest======】");
            Thread.sleep(20);
            Console.log("【end======timeoutExceedPreemptivelyTest======】");
        });
    }
}
