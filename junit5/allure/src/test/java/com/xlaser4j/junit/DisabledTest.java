package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/27 18:19
 * @description:
 * @modified: Elijah.D
 */
/// @Disabled("Disabled this class tests!")
public class DisabledTest {
    /**
     * {@code @Disabled} is used to signal that the annotated test class or test method is currently
     * <em>disabled</em> and should not be executed.
     * 等价于junit4中的{@code @Ignore}跳过这个测试方法或者测试类的所有方法.
     */
    @Disabled("Disabled disabledTest method!")
    @Test
    public void disabledTest() {
        assertTrue(false);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void onlyOnJava8() {
        Console.log("【true】:{}", "该测试在JDK 8中启用");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void onlyOnWinOs() {
        Console.log("【true】:{}", "该测试只能在WINDOWS中执行");
    }

    /**
     * {@link EnabledOnOs}
     */
    @Test
    @EnabledOnOs(OS.MAC)
    public void onlyOnMacOs() {
        Console.log("【true】:{}", "该测试只能在MAC中执行");
    }
}
