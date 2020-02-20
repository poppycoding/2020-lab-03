package com.xlaser4j.junit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;

/**
 * @package: com.xlaser4j.junit.annotation
 * @author: Elijah.D
 * @time: 2019/11/29 14:06
 * @description: 测试自定义注解绑定tag, mvn中配置filter
 * @modified: Elijah.D
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Tag("non-functional")
@Tag("security")
public @interface Security {
}
