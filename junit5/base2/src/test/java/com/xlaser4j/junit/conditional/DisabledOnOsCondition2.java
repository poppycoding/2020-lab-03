package com.xlaser4j.junit.conditional;

import java.util.Arrays;
import java.util.Optional;

import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;

/**
 * 本质上{@code ExecutionCondition}通过{@link ExtensionContext}计算一个case是否应该执行.
 * {@link ConditionEvaluationResult}
 *
 * @package: com.xlaser4j.junit.annotation
 * @author: Elijah.D
 * @time: 2019/12/2 14:15
 * @description: 自定义注解
 * @modified: Elijah.D
 */
public class DisabledOnOsCondition2 implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        // 初始化reason,假设不存在注解@DisabledOnOs2
        ConditionEvaluationResult result = ConditionEvaluationResult.enabled("@DisabledOnOs2 is not present");

        // 存在注解则设置reason
        Optional<DisabledOnOs2> systems = AnnotationUtils.findAnnotation(context.getElement(), DisabledOnOs2.class);
        return systems.map(o -> build((Arrays.stream(o.value()).anyMatch(OS2::isCurrentOs)), context.getDisplayName(), OS2.getEnvOs().toString())).orElse(result);
    }

    /**
     * 打印日志查看信息
     *
     * @param args
     * @return
     */
    private ConditionEvaluationResult build(boolean isDisabled, String... args) {
        ConditionEvaluationResult result = ConditionEvaluationResult.enabled(args[0] + " is enabled on " + args[1]);
        if (isDisabled) {
            result = ConditionEvaluationResult.disabled(args[0] + " is disabled on " + args[1]);
        }

        //noinspection OptionalGetWithoutIsPresent
        Console.log("===>> " + result.getReason().get());
        return result;
    }
}
