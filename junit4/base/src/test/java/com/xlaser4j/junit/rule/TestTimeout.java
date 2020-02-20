package com.xlaser4j.junit.rule;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/15 13:56
 * @description: 测试timeOut
 * @modified: Elijah.D
 */
public class TestTimeout {
    /**
     * Optionally specify <code>timeout</code> in milliseconds to cause a test method to fail
     * if it takes longer than that number of milliseconds.
     * 设定超时时间,如果执行时间大于设定时间,则方法执行失败;
     * <p>
     * Consider using the {@link org.junit.rules.Timeout} rule instead, which ensures a test
     * method is run on the same thread as the fixture's @Before and @After methods.
     * 存在线程安全问题,建议使用org.junit.rules.Timeout
     *
     * @throws InterruptedException
     */
    @Test(timeout = 1000)
    public void testA() throws InterruptedException {
        Thread.sleep(800);
    }

    @Ignore
    @Test(timeout = 1000)
    public void testB() throws InterruptedException {
        Thread.sleep(2000);
    }
}