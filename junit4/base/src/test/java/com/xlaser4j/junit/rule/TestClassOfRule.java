package com.xlaser4j.junit.rule;

import cn.hutool.core.lang.Console;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * 不同于{@link TestExternalResourceOfRule}每个测试用例都会执行一次,ClassRule只会执行一次
 *
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/22 16:03
 * @description: 测试classRule, 静态static级别, 只会执行一次
 * @modified: Elijah.D
 */
public class TestClassOfRule {
    private static Resource resource = new Resource();

    @ClassRule
    public static ExternalResource rule = new ExternalResource() {
        /**
         * before是case执行之前,所以获取不到name
         */
        @Override
        protected void before() {
            resource.open();
        }

        /**
         * after是case执行之后,所以可以获取name
         */
        @Override
        protected void after() {
            resource.close();
        }
    };

    @BeforeClass
    public static void before() {
        Console.log("before class");
    }

    @Test
    public void firstTest() {
        Console.log(resource.get());
    }

    @Test
    public void secondTest() {
        Console.log(resource.get());
    }
}


