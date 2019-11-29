package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import com.xlaser.junit.annotation.Functional;
import org.junit.jupiter.api.Test;

/**
 * 参见mvn中plugins配置:<groups>functional,non-functional,Two</groups>
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/29 10:42
 * @description: 测试自定义注解绑定tag, mvn中配置filter
 * @copyright: Copyright(c) 2019
 * @version: V1.0
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
