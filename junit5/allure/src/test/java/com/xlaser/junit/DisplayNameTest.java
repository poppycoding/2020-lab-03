package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Display names are typically used for test reporting in IDEs and build tools and may contain
 * spaces, special characters, and even emoji.
 * 用于IDE及其他构建工具中显示的名字,可以包含空格,特殊字符,表情!
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/27 14:49
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@DisplayName("Class Test Name")
public class DisplayNameTest {
    @Test
    @DisplayName("testChinese: 哈哈")
    public void testChinese() {
        Console.log("【testChinese】:{}", "中文");
    }

    @Test
    @DisplayName("testEmoji: 👌")
    public  void testEmoji() {
        Console.log("【testEmoji】:{}", "Emoji");
    }
}
