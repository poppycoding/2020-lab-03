package com.xlaser.junit.resolver;

import java.lang.reflect.Parameter;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

/**
 * @package: com.xlaser.junit.resolver
 * @author: Elijah.D
 * @time: 2019/12/6 11:04
 * @description: unknown just keep
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class CustomParameterResolver implements ParameterResolver {
    /**
     * Determine if this resolver supports resolution of an argument for the {@link Parameter}
     * in the supplied {@link ParameterContext} for the supplied {@link ExtensionContext}.
     *
     * @param parameterContext should be resolved
     * @param extensionContext invoked by {@code Executable}
     * @return can resolve{@code true}
     * @see #resolveParameter
     * @see ParameterContext
     */
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return true;
    }

    /**
     * Resolve an argument for the {@link Parameter} in the supplied {@link ParameterContext}
     * for the supplied {@link ExtensionContext}.
     *
     * <p>This method is only called by the framework if {@link #supportsParameter} previously
     * returned {@code true} for the same {@link ParameterContext} and {@link ExtensionContext}.
     *
     * @param parameterContext should be resolved
     * @param extensionContext invoked by {@code Executable}
     * @return resolved argument
     * @see #supportsParameter
     * @see ParameterContext
     */
    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return "CustomParameterResolver";
    }
}
