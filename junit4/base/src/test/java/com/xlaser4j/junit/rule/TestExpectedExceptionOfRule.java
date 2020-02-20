package com.xlaser4j.junit.rule;

import cn.hutool.core.lang.Console;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @package: com.xlaser4j.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/19 14:35
 * @description: 测试ExpectException
 * @modified: Elijah.D
 */
public class TestExpectedExceptionOfRule {
    /**
     * 定义预期异常规则,不会影响其他测试用例,同时验证逻辑是否按照预期所需异常
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsNothing() {
        Console.log("【ExpectedException】:{}", "ExpectedException不会影响其他测试用执行!");
    }

    /**
     * 符合预期的异常,还可以定义message等预期结果eg:
     * <p>
     * The exception's message contains a specific text: {@link ExpectedException#expectMessage(String)}
     * The exception's message complies with a Hamcrest matcher: {@link ExpectedException#expectMessage(Matcher)}
     * The exception's cause complies with a Hamcrest matcher: {@link ExpectedException#expectCause(Matcher)}
     * The exception itself complies with a Hamcrest matcher: {@link ExpectedException#expect(Matcher)}
     */
    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("test msg!");
        throw new NullPointerException("test msg!");
    }
}
