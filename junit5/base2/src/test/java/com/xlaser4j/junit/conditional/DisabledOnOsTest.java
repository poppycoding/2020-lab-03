package com.xlaser4j.junit.conditional;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;

import static org.junit.jupiter.api.condition.OS.*;

/**
 * @package: com.xlaser4j.junit.conditional
 * @author: Elijah.D
 * @time: 2019/12/2 15:58
 * @description: 测试junit内置DisabledOnOs
 * @modified: Elijah.D
 * @see DisabledOnOs
 */
class DisabledOnOsTest {
    @DisabledOnOs(LINUX)
    @Test
    void notLinuxTest() {
        Console.log("Disabled on Linux");
    }

    @DisabledOnOs(WINDOWS)
    @Test
    void notWinTest() {
        Console.log("Disabled on Windows");
    }

    @DisabledOnOs(MAC)
    @Test
    void notMacTest() {
        Console.log("Disabled on Mac");
    }
}
