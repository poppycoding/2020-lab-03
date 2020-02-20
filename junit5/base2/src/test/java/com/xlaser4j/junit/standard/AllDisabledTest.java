package com.xlaser4j.junit.standard;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlaser4j.junit.standard
 * @author: Elijah.D
 * @time: 2019/12/3 10:58
 * @description: junit5
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
