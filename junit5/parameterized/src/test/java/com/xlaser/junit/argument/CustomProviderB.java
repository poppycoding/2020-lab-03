package com.xlaser.junit.argument;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * @package: com.xlaser.junit.argument
 * @author: Elijah.D
 * @time: 2019/12/5 12:41
 * @description: 自定义参数
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class CustomProviderB implements ArgumentsProvider {
    /**
     * Provide a {@link Stream} of {@link Arguments} to be passed to a {@code @ParameterizedTest} method.
     * 提供一个arguments参数的流进行参数化测试.
     * <p>
     * {@link Arguments#arguments(Object...)}为静态导入设置的方法,内部调用Arguments.of
     *
     * @param context the current extension context; never {@code null}
     * @return a stream of arguments; never {@code null}
     */
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        System.out.println(context.getDisplayName() + " completed execute.");
        return Stream.of(arguments("Hi", "Arguments2", 8881), arguments("Hi", "Arguments2-2", 8882));
    }
}
