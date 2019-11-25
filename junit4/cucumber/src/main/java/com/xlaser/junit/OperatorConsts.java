package com.xlaser.junit;

import java.util.List;

import lombok.Getter;

import static java.util.Arrays.asList;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 13:51
 * @description: operator constants
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Getter
public class OperatorConsts {
    public static final List<String> OPERATORS = asList("-", "+", "*", "/");

    /**
     * +
     */
    public final static String PLUS = "+";

    /**
     * -
     */
    public final static String MINUS = "-";

    /**
     * *
     */
    public final static String MULTIPLE = "*";

    /**
     * /
     */
    public final static String DIVISION = "/";
}
