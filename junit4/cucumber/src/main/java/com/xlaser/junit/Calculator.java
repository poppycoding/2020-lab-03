package com.xlaser.junit;

import java.util.Deque;
import java.util.LinkedList;

import cn.hutool.core.lang.Console;

import static com.xlaser.junit.OperatorConsts.*;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 13:49
 * @description: 计算器操作
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class Calculator {
    private final Deque<Number> stack = new LinkedList<>();

    /**
     * 计算逻辑:先输入两个需要计算的数字最后输入操作符,然后依次取出数字根据操作符进行计算
     *
     * @param arg 数字/操作符
     */
    @SuppressWarnings("SuspiciousMethodCalls")
    public void push(Object arg) {
        if (OPERATORS.contains(arg)) {
            Number y = stack.removeLast();
            Number x = stack.isEmpty() ? 0 : stack.removeLast();
            Double val = null;
            if (MINUS.equals(arg)) {
                val = x.doubleValue() - y.doubleValue();
            } else if (PLUS.equals(arg)) {
                val = x.doubleValue() + y.doubleValue();
            } else if (MULTIPLE.equals(arg)) {
                val = x.doubleValue() * y.doubleValue();
            } else if (DIVISION.equals(arg)) {
                val = x.doubleValue() / y.doubleValue();
            } else {
                Console.log("【Error】:val is error:{}", val);
            }
            push(val);
        } else {
            stack.add((Number)arg);
        }
    }

    /**
     * 最后的计算结果
     *
     * @return result
     */
    public Number value() {
        return stack.getLast();
    }
}
