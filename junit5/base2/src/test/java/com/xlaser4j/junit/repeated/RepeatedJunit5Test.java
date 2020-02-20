package com.xlaser4j.junit.repeated;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

/**
 * @package: com.xlaser4j.junit.repeated
 * @author: Elijah.D
 * @time: 2019/12/3 11:18
 * @description: junit5 repeated
 * @modified: Elijah.D
 */
public class RepeatedJunit5Test {
    /**
     * 测试repeated
     */
    @RepeatedTest(4)
    public void repeatTest() {
        System.out.println(System.currentTimeMillis() + ": repeated test");
    }

    /**
     * 重复测试显示名字策略:默认{@link RepeatedTest#SHORT_DISPLAY_NAME}
     * <p>
     * "repetition " + CURRENT_REPETITION_PLACEHOLDER + " of " + TOTAL_REPETITIONS_PLACEHOLDER
     * repetition + 当前次数 + of + 总次数
     *
     * @param testInfo
     */
    @RepeatedTest(value = 2)
    @DisplayName("Test using short display name")
    public void customDisplayNameWithShortPattern(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    /**
     * 重复测试显示名字策略:{@link RepeatedTest#LONG_DISPLAY_NAME}
     * <p>
     * DISPLAY_NAME_PLACEHOLDER + " :: " + SHORT_DISPLAY_NAME
     * 设置的名字 + :: + 短名称
     *
     * @param testInfo
     */
    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Test using long display name")
    public void customDisplayNameWithLongPattern(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    /**
     * 自定义组合名称:利用placeholder占位符,自定义组装即可
     *
     * @param testInfo
     */
    @RepeatedTest(value = 2, name = "{displayName} {currentRepetition}/{totalRepetitions}: 当前执行:{currentRepetition},共计重复:{totalRepetitions}")
    @DisplayName("HaHa! customDisplay =====> ")
    public void customDisplayName(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }
}
