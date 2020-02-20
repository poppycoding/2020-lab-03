package com.xlaser4j.junit.rule;

import cn.hutool.core.lang.Console;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.fail;

/**
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/18 17:05
 * @description: 测试testWatcher
 * @modified: Elijah.D
 */
public class TestWatcherOfRule {
    /**
     * TestWatcher is a base class for Rules that take note of the testing action, without modifying it.
     * 一个测试规则基类,在不修改testCase情况下,可以监控case
     * <p>
     * {@link Description} are used to provide feedback about the tests that are about to run
     * (for example, the tree view visible in many IDEs) or tests that have been run
     * (for example, the failures view).
     * {@link junit.framework.TestCase}and {@link junit.framework.TestSuite}
     * Description类是代替junit3中的case&suite,为测试用例提供反馈,如执行前的树形结构,执行后的用例失败图
     */
    @Rule
    public TestWatcher watchman = new TestWatcher() {
        /**
         * For example, TestWatcher will keep a log of each passing test
         * 对通过的case记录日志
         *
         * @param description 描述case的信息
         */
        @Override
        protected void succeeded(Description description) {
            Console.log("Note test succeeded: " + description.getMethodName());
        }

        /**
         * For example, TestWatcher will keep a log of each failing test
         * 对未通过的case记录日志
         *
         * @param e
         * @param description 描述case的信息
         */
        @Override
        protected void failed(Throwable e, Description description) {
            Console.log("Note test failed: " + description.getMethodName());
        }
    };

    @Ignore
    @Test
    public void redTest() {
        fail();
    }

    @Test
    public void greenTest() {
    }
}
