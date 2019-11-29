package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/29 17:36
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
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
