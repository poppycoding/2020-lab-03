package com.xlaser.junit.standard;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser.junit.standard
 * @author: Elijah.D
 * @time: 2019/12/3 10:58
 * @description: junit5
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Disabled("测试:Disabled on class!")
public class AllDisabledTest {
    @Test
    public void skippedTestOne() {
        System.out.println("skipped!");
    }

    @Test
    public void skippedTestTwo() {
        System.out.println("skipped!");
    }
}
