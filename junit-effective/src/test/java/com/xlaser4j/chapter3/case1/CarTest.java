package com.xlaser4j.chapter3.case1;

import com.xlaser4j.junit.chapter3.case1.Car;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @package: com.xlaser4j.chapter3.case1
 * @author: Elijah.D
 * @time: 2020/3/24 16:57
 * @description:
 * @modified: Elijah.D
 */
public class CarTest {
    /**
     * 当汽车启动,怎么测试engine也是启动的? 可以把私有对象engine开放,同时添加一个方法去判断,但是这样就仅仅为测试添加了
     * 无用的功能,还有一种做法就是利用替身{@link TestEngine}
     */
    @Test
    public void engineIsStartedWhenCarStarts() {
        TestEngine engine = new TestEngine();
        new Car(engine).start();
        assertTrue(engine.isRunning());
    }
}
