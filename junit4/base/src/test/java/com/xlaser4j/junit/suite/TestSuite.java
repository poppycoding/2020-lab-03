package com.xlaser4j.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 带有RunWith注解的测试类,会对Suite中的class执行class
 *
 * @package: com.xlaser4j.junit.suite
 * @author: Elijah.D
 * @time: 2019/11/22 16:00
 * @description: 测试Suite组


 * @modified: Elijah.D
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestSuiteOne.class, TestSuiteTwo.class})
public class TestSuite {
}
