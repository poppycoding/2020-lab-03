package com.xlaser.junit.conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;

/**
 * 通过{@link ExtendWith}扩展{@link org.junit.jupiter.api.extension.Extension}
 * eg: {@linkplain org.junit.jupiter.api.extension.ExecutionCondition}
 *
 * @package: com.xlaser.junit.annotation
 * @author: Elijah.D
 * @time: 2019/12/2 14:18
 * @description: 自定义注解, 通过Extend扩展功能
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(DisabledOnOsCondition2.class)
public @interface DisabledOnOs2 {
    /**
     * Operating systems on which the annotated class or method should be disabled.
     *
     * @see OS2
     */
    OS2[] value();
}