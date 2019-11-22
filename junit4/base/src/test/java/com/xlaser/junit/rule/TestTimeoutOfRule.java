package com.xlaser.junit.rule;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * @package: com.xlaser.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/15 14:03
 * @description: 测试rule中的timeout
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestTimeoutOfRule {
    /**
     * Timeout将对所有test检测是否超时,rule中的timeout是线程安全的,它会启动新的线程执行
     */
    @Rule
    public Timeout globalTimeout = new Timeout(100, MILLISECONDS);

    @Ignore
    @Test
    public void testInfiniteLoop() {
        while (true)
            ;
    }

    @Test
    public void testDoNothing() {
    }
}
