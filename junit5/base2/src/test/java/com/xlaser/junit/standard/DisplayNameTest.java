package com.xlaser.junit.standard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser.junit.standard
 * @author: Elijah.D
 * @time: 2019/12/3 10:54
 * @description: junit5
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@DisplayName("junit5 display name on class")
public class DisplayNameTest {
    @Test
    @DisplayName("中文字符 + 空 格")
    public void testWithDisplayNameContainingSpaces() {
    }

    @Test
    @DisplayName("哈哈:╯°□°）╯")
    public void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("表情包:😱")
    public void testWithDisplayNameContainingEmoji() {
    }
}