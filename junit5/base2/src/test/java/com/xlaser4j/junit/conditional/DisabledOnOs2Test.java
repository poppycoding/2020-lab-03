package com.xlaser4j.junit.conditional;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser4j.junit.annotation
 * @author: Elijah.D
 * @time: 2019/12/2 15:41
 * @description: 测试条件注解
 * @modified: Elijah.D
 */
public class DisabledOnOs2Test {
    /**
     * 禁止unix系统测试
     */
    @DisabledOnOs2({OS2.LINUX, OS2.MAC})
    @Test
    public void winTest() {
        Console.log("【winTest】");
    }

    /**
     * 禁止win系统测试
     */
    @DisabledOnOs2({OS2.WINDOWS})
    @Test
    public void unixTest() {
        Console.log("【unixTest】");
    }
}
