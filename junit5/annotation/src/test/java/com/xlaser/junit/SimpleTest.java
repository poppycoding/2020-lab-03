package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * 参见mvn中plugins配置:<groups>functional,non-functional,Two</groups>
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/29 14:18
 * @description: 测试tag, mvn中配置filter
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class SimpleTest {
    @Test
    @Tag("One")
    public void testTagOne() {
        Console.log("TestTag Test 1");
    }

    @Test
    @Tag("Two")
    public void testTagTwo() {
        Console.log("TestTag Test 2");
    }
}
