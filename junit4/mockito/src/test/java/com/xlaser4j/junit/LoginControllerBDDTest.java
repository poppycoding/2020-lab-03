package com.xlaser4j.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

/**
 * 使用@RunWith(MockitoJUnitRunner.class)或Mockito.initMocks(this)进行mocks的初始化和注入.
 * <p>
 * Behavior Driven Development:行为驱动模式,测试给定的场景
 *
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/25 17:44
 * @description: BDD测试
 * @modified: Elijah.D
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginControllerBDDTest {
    /**
     * Note that @InjectMocks will only inject mocks/spies created using the @Spy or @Mock annotation
     * 创建一个实例，其余用@Mock（或@Spy）注解创建的mock将被注入到用该实例中.
     */
    @InjectMocks
    private LoginController controller;

    /**
     * 创建一个Mock并且注入到InjectMocks
     */
    @Mock
    private LoginService service;

    private LoginForm form = new LoginForm("foo", "bar");

    /**
     * service返回true时controller返回ok
     */
    @Test
    public void testLoginOk() {
        given(service.login(form)).willReturn(true);
        assertEquals("OK", controller.login(form));
    }

    /**
     * service返回false时controller返回ko
     */
    @Test
    public void testLoginKo() {
        given(service.login(form)).willReturn(false);
        assertEquals("KO", controller.login(form));
    }

    /**
     * form为null时controller返回error
     */
    @Test
    public void testLoginError() {
        assertEquals("ERROR", controller.login(null));
    }

    /**
     * service返回exception时controller返回error
     * <p>
     * 注意willThrow/willReturn的值要匹配service实际值,或者子类.
     * eg:此处throw的异常只能是RuntimeException及其子类,不能是Exception,因为实际定义的异常就继承于RuntimeException
     */
    @Test
    public void testLoginWithException() {
        given(service.login(form)).willThrow(RuntimeException.class);
        assertEquals("ERROR", controller.login(form));
    }
}