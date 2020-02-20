package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;
import com.xlaser4j.junit.annotation.Functional;
import org.junit.jupiter.api.Test;

/**
 * 参见mvn中plugins配置:<groups>functional,non-functional,Two</groups>
 *
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/29 10:42
 * @description: 测试自定义注解绑定tag, mvn中配置filter
 * @modified: Elijah.D
 */
@Functional
public class FunctionalTest {
    @Test
    public void testOne() {
        Console.log("Functional Test 1");
    }

    @Test
    public void testTwo() {
        Console.log("Functional Test 2");
    }
}
