package com.xlaser.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/12 16:27
 * @description: junit3 测试
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestAll {
    /**
     * junit中的testSuite测试类型:
     * <p>
     * eg:参数调用
     * TestSuite suite= new TestSuite();
     * suite.addTest(new MathTest("testAdd"));
     * suite.addTest(new MathTest("testDivideByZero"));
     * <p>
     * eg:构造调用(test开头且没有参数的方法)
     * TestSuite suite= new TestSuite(MathTest.class);
     * <p>
     * eg:测试类较多
     * Class[] testClasses = { MathTest.class, AnotherTest.class }
     * TestSuite suite= new TestSuite(testClasses);
     *
     * @return suite
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("All tests");
        suite.addTestSuite(TestSimple.class);
        suite.addTestSuite(TestMinimal.class);
        return suite;
    }
}
