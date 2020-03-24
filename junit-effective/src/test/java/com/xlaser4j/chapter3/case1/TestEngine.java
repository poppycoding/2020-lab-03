package com.xlaser4j.chapter3.case1;

import com.xlaser4j.junit.chapter3.case1.Engine;

/**
 * @package: com.xlaser4j.chapter3.case1
 * @author: Elijah.D
 * @time: 2020/3/24 16:59
 * @description:
 * @modified: Elijah.D
 */
public class TestEngine extends Engine {
    private boolean isRunning;

    @Override
    public void start() {
        isRunning = true;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
