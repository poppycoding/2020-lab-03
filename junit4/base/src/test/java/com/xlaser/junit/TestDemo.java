package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/14 17:04
 * @description: 测试用例junit4
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestDemo {
    /**
     * 当一组测试用例,都需要共同的资源时,可以使用<code>@BeforeClass</code>,它是静态类在所有test之前只执行一次.
     * <p>
     * eg:获取DB连接
     */
    @BeforeClass
    public static void setupClass() {
        Console.log(".........Setup Class............");
    }

    /**
     * 配合<code>@BeforeClass</code>使用,分配资源后,在所有test执行完之后,利用<code>@AfterClass</code>
     * 关闭释放资源
     */
    @AfterClass
    public static void teardownClass() {
        Console.log(".........tearDown Class.........");
    }

    /**
     * it is common to find that several tests need similar objects created before they can run
     * <p>
     * 等价于junit3,是在每一个test之前执行一次,eg:多个测试执行之前都需要创建相同的对象
     */
    @Before
    public void setupTest() {
        Console.log(".........Setup all............");
    }

    /**
     * If you allocate external resources in<code>@Before</code> method you need to release them
     * <p>
     * 每一个test执行之后,用于释放资源
     */
    @After
    public void teardownTest() {
        Console.log(".........tearDown all.........");
    }

    /**
     * The <code>Test</code> annotation tells JUnit that the method to which it is attached can be run as a test case.
     * <p>
     * junit4中用test注解标识一个单元测试
     */
    @Test
    public void testSuccess() {
        int expected = 60;
        int real = 60;
        Console.log("success");

        assertEquals(expected + " should be equals to " + real, expected, real);
    }

    /**
     * Sometimes you want to temporarily disable a test or a group of tests. Methods annotated with
     * <code>Ignore</code> will not be executed as tests.
     * <p>
     * 忽略这个测试用例: Test ignored.
     */
    @Ignore
    @Test
    public void testFailure() {
        int expected = 20;
        int real = 20;
        Console.log("failed");

        assertEquals(expected + " should be equals to " + real, expected, real);
    }
}
