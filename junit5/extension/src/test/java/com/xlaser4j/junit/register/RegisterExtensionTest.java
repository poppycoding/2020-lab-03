package com.xlaser4j.junit.register;

import java.io.IOException;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.ExpectedException;

/**
 * @package: com.xlaser4j.junit.register
 * @author: Elijah.D
 * @time: 2019/12/6 11:08
 * @description: 通过register注入扩展
 * @modified: Elijah.D
 */
@EnableRuleMigrationSupport
public class RegisterExtensionTest {
    /**
     * <p>In contrast to {@link org.junit.jupiter.api.extension.ExtendWith @ExtendWith} which
     * is used to register extensions <em>declaratively</em>, {@code @RegisterExtension} can be
     * used to register an extension <em>programmatically</em> &mdash;
     * <p>
     * ExtendWith: 声明式注入扩展
     * RegisterExtension: 编程式注入扩展
     */
    @RegisterExtension
    static CustomExceptionHandlerExtension custom = new CustomExceptionHandlerExtension();

    /**
     * 定义预期异常规则,不会影响其他测试用例,同时验证逻辑是否按照预期所需异常
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * {@link CustomExceptionHandlerExtension#handleTestExecutionException(ExtensionContext, Throwable)}
     * <p>
     * SWALLOW
     */
    @Test
    public void NPETest() {
        throw new NullPointerException("NullPointerException");
    }

    /**
     * {@link CustomExceptionHandlerExtension#handleTestExecutionException(ExtensionContext, Throwable)}
     * <p>
     * THROW AND MODIFY
     */
    @Test
    public void IOTest() throws IOException {
        thrown.expect(CustomException.class);
        thrown.expectMessage("Modify To CustomException.");
        throw new IOException("IO Exception");
    }

    /**
     * {@link CustomExceptionHandlerExtension#handleTestExecutionException(ExtensionContext, Throwable)}
     * <p>
     * RETHROW
     */
    @Test
    public void IOOBTest() {
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        thrown.expectMessage("ArrayIndexOutOfBoundsException");
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
    }
}
