package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;
import com.xlaser4j.junit.annotation.*;
import org.junit.jupiter.api.Test;

/**
 * 参见mvn中配置: <excludedGroups>load,One</excludedGroups>
 *
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/29 10:44
 * @description: 测试自定义注解绑定tag, mvn中配置filter
 * @modified: Elijah.D
 */
class NonFunctionalTest {
    @Test
    @Accessibility
    public void testZero() {
        Console.log("Non-Functional Test 0 (Accessibility)");
    }

    @Test
    @Load
    public void testOne() {
        Console.log("Non-Functional Test 1 (Performance/Load)");
    }

    @Test
    @Stress
    public void testTwo() {
        Console.log("Non-Functional Test 2 (Performance/Stress)");
    }

    @Test
    @Security
    public void testThree() {
        Console.log("Non-Functional Test 3 (Security)");
    }

    @Test
    @Usability
    public void testFour() {
        Console.log("Non-Functional Test 4 (Usability)");
    }
}
