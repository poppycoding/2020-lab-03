package com.xlaser.junit.assertion;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @package: com.xlaser.junit.assertion
 * @author: Elijah.D
 * @time: 2019/11/29 17:05
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class SimpleTest {
    /**
     * 在junit4的assert中错误消息是在第一个参数,junit5中改成第二个参数
     */
    @Test
    public void simpleTest() {
        assertEquals(2, 2);
        assertFalse(false, "Optional assertion msg position changed!");
        assertTrue(true, "In the junit4 is in the first parameter but now junit5 in the last parameter!");
    }

    /**
     * 测试msg
     */
    @Test
    @Disabled("Ignore the msgTest just for test msg!")
    public void msgTest() {
        assertEquals(2, 3, "Test msg!");
    }

    /**
     * 测试批量assert,某一个预期出现错误,不会终止测试,最后统一返回测试结果
     *
     * @see org.opentest4j.MultipleFailuresError
     */
    @Test
    @Disabled("Ignore the msgTest just for testing group assertions!")
    public void groupAssertionTest() {
        Person person = new Person("DU", "ELIJAH");
        assertAll("================Person Name Test Info================",
                () -> assertEquals(2, 3, "Test msg!"),
                () -> assertEquals("DU", person.getFirstName(), "First name error!"),
                () -> assertEquals("ELIJAH2", person.getLastName(), "Last name error!"));
    }
}
