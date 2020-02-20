package com.xlaser4j.junit.assertion;

import cn.hutool.core.lang.Console;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/29 17:36
 * @description:
 * @modified: Elijah.D
 */
@Data
@AllArgsConstructor
public class Person {
    private String firstName;

    private String lastName;

    /**
     * 测试超时设置
     */
    public static void test() {
        Console.log("test timeout with method");
    }
}
