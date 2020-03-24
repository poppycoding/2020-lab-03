package com.xlaser4j.junit.chapter3.case2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @package: com.xlaser4j.junit.chapter3.case2
 * @author: Elijah.D
 * @time: 2020/3/24 17:05
 * @description:
 * @modified: Elijah.D
 */
@Data
@AllArgsConstructor
public class Translator {
    private Internet internet;

    public String translate(String key) {
        return internet.get(key);
    }
}
