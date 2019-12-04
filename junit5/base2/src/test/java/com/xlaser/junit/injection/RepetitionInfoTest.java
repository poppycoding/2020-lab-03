package com.xlaser.junit.injection;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

/**
 * @package: com.xlaser.junit.info
 * @author: Elijah.D
 * @time: 2019/12/4 12:23
 * @description: 注如RepetitionInfo
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class RepetitionInfoTest {
    /**
     * repetition information
     *
     * @param repetitionInfo
     * @see org.junit.jupiter.api.TestInfo
     */
    @RepeatedTest(2)
    void test(RepetitionInfo repetitionInfo) {
        System.out.println("** Test " + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
    }
}
