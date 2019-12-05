package com.xlaser.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <blockquote><pre>
 * int fileCount = 1273;
 * String diskName = "MyDisk";
 * Object[] testArgs = {new Long(fileCount), diskName};
 *
 * MessageFormat form = new MessageFormat(
 *     "The disk \"{1}\" contains {0} file(s).");
 *
 * System.out.println(form.format(testArgs));
 * </pre></blockquote>
 * The output with different values for <code>fileCount</code>:
 * <blockquote><pre>
 * The disk "MyDisk" contains 0 file(s).
 * The disk "MyDisk" contains 1 file(s).
 * The disk "MyDisk" contains 1,273 file(s).
 * </pre></blockquote>
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/12/5 17:11
 * @description: 利用messageFormat自定义参数化测试名字
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
class CustomNameTest {
    /**
     * DEFAULT_DISPLAY_NAME = "[" + INDEX_PLACEHOLDER + "] " + ARGUMENTS_PLACEHOLDER
     * 默认是数据源的顺序位置 + 数据源参数值
     *
     * @param first
     * @param second
     */
    @DisplayName("Default")
    @ParameterizedTest
    @CsvSource({"default, 1", "default, 2"})
    void testDefaultDisplayNames(String first, int second) {
        assertAll("Default",
                () -> assertNotNull(first),
                () -> assertTrue(second > 0));
    }

    /**
     * 根据{@link java.text.MessageFormat}规则,自定义参数化测试名字
     *
     * @param first
     * @param second
     */
    @DisplayName("Custom")
    @ParameterizedTest(name = "{index} first-argument:{0}, second-argument:{1}")
    @CsvSource({"custom, 1", "custom, 2"})
    void testCustomDisplayNames(String first, int second) {
        assertAll("Default",
                () -> assertNotNull(first),
                () -> assertTrue(second > 0));
    }
}
