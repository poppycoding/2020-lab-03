package com.xlaser4j.junit.resolver;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @package: com.xlaser4j.junit.resolver
 * @author: Elijah.D
 * @time: 2019/12/6 11:05
 * @description:
 * @modified: Elijah.D
 */
class ExtendResolverTest {
    /**
     * <p>In contrast to {@link org.junit.jupiter.api.extension.ExtendWith @ExtendWith} which
     * is used to register extensions <em>declaratively</em>, {@code @RegisterExtension} can be
     * used to register an extension <em>programmatically</em> &mdash;
     * <p>
     * ExtendWith: 声明式注入扩展
     * RegisterExtension: 编程式注入扩展
     */
    @Test
    @ExtendWith(CustomParameterResolver.class)
    void testExtendWithExtension(Object parameter) {
        System.out.println("Parameter is resolved to: " + parameter);
    }
}
