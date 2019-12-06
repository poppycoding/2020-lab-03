package com.xlaser.junit.register;

import java.io.IOException;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

/**
 * @package: com.xlaser.junit.register
 * @author: Elijah.D
 * @time: 2019/12/6 11:07
 * @description: 自定义异常处理器
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class CustomExceptionHandlerExtension implements TestExecutionExceptionHandler {
    /**
     * 处理异常的三种方案,任选一个
     *
     * <li>Swallow: 内部处理掉异常</li>
     * <li>Rethrow: 不处理继续上抛异常</li>
     * <li>Throw: 处理并抛出一个新的异常</li>
     *
     * @param context   current extension context
     * @param throwable to handle
     */
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println("CaseName: ===>>" + context.getDisplayName());

        // SWALLOW
        if (throwable instanceof NullPointerException) {
            System.out.println("Swallow: NullPointerException");
            return;
        }

        // THROW
        if (throwable instanceof IOException) {
            System.out.println("Throw: IOException but modify to customException");
            throw new CustomException("Modify To CustomException.");
        }

        // RETHROW
        throw throwable;
    }
}
