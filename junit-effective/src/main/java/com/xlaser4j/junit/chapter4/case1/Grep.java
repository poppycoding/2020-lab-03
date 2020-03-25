package com.xlaser4j.junit.chapter4.case1;

/**
 * @package: com.xlaser4j.junit.chapter4.case1
 * @author: Elijah.D
 * @time: 2020/3/25 10:17
 * @description: 模拟断言的Code Smell
 * @modified: Elijah.D
 */
public class Grep {
    public String grep(String key, String fileName, String content) {
        return key + fileName + content;
    }
}
