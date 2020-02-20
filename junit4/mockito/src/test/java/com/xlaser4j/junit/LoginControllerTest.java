package com.xlaser4j.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:11
 * @description: 测试controller
 * @modified: Elijah.D
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
    /**
     * Note that @InjectMocks will only inject mocks/spies created using the @Spy or @Mock annotation
     * 创建一个实例，其余用@Mock（或@Spy）注解创建的mock将被注入到用该实例中.
     */
    @InjectMocks
    private LoginController controller;

    /**
     * 实际调用了repo
     */
    @Mock
    private LoginService service;

    private LoginForm form = new LoginForm("foo", "bar");

    @Test
    public void testLogin() {
        controller.login(form);

        verify(service).login(form);
        verifyNoMoreInteractions(service);
    }

    @Test
    public void testLoginOk() {
        when(service.login(form)).thenReturn(true);

        assertEquals("OK", controller.login(form));

        verify(service).login(form);
        verifyNoMoreInteractions(service);
    }

    @Test
    public void testLoginKo() {
        when(service.login(form)).thenReturn(false);

        assertEquals("KO", controller.login(form));
    }

    @Test
    public void testLoginError() {
        assertEquals("ERROR", controller.login(null));
    }

    @Test
    public void testLoginWithException() {
        when(service.login(form)).thenThrow(IllegalArgumentException.class);

        assertEquals("ERROR", controller.login(form));
    }

    @Test
    public void testLogout() {
        controller.logout(form);

        verify(service).logout(form);
        verifyNoMoreInteractions(service);
    }
}