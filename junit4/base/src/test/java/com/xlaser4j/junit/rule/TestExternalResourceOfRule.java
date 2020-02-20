package com.xlaser4j.junit.rule;

import cn.hutool.core.lang.Console;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

/**
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/19 14:04
 * @description: 测试ExternalResource
 * @modified: Elijah.D
 */
public class TestExternalResourceOfRule {
    @Rule
    public TestName name = new TestName();

    private Resource resource = new Resource();

    /**
     * A base class for Rules that set up an external resource before a test and guarantee to tear it down afterward
     * 测试规则的一个基类,可以初始化一些外部资源,并且在case执行之后销毁资源,例如创建临时文件,数据库连接等
     *
     * @see TestTemporaryFolderOfRule
     */
    @Rule
    public ExternalResource rule = new ExternalResource() {
        /**
         * before是case执行之前,所以获取不到name
         */
        @Override
        protected void before() {
            resource.open();
            Console.log(name.getMethodName());
        }

        /**
         * after是case执行之后,所以可以获取name
         */
        @Override
        protected void after() {
            resource.close();
            Console.log(name.getMethodName());
        }
    };

    @Test
    public void firstTest() {
        Console.log(resource.get());
    }

    @Test
    public void secondTest() {
        Console.log(resource.get());
    }
}

/**
 * 测试资源
 */
class Resource {
    void open() {
        Console.log("Opened");
    }

    void close() {
        Console.log("Closed");
    }

    double get() {
        return Math.random();
    }
}

