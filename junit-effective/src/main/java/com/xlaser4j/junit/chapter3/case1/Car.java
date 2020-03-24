package com.xlaser4j.junit.chapter3.case1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @package: com.xlaser4j.junit.chapter3.case1
 * @author: Elijah.D
 * @time: 2020/3/24 16:56
 * @description:
 * @modified: Elijah.D
 */
@Data
@AllArgsConstructor
public class Car {
    private Engine engine;

    public void start() {
        engine.start();
    }
}
