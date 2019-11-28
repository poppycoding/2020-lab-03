package com.xlaser.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * allure运行serve命令之后(README.md),浏览器默认63593端口查看allure可视化界面.
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/27 15:05
 * @description: 测试Disabled
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class AllureReportTest {
    @Test
    public void successTest() {
        assertTrue(true);
    }

    @Test
    public void failureTest() {
        assertTrue(false);
    }

    @Test
    public void brokenTest() {
        throw new RuntimeException("This test seems to be broken!");
    }

    /**
     * 在allure报表中Timeline中查看慢执行
     *
     * @throws InterruptedException
     */
    @Test
    public void slowSuccessTest() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test
    public void slowFailureTest() throws InterruptedException {
        Thread.sleep(600);
        assertTrue(false);
    }

    @Test
    public void slowBrokenTest() throws InterruptedException {
        Thread.sleep(700);
        throw new RuntimeException("ZZZ...");
    }
}
