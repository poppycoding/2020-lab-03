package com.xlaser.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 10:40
 * @description: service测试
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {
    /**
     * Note that @InjectMocks will only inject mocks/spies created using the @Spy or @Mock annotation
     * 创建一个实例,其余用@Mock（或@Spy）注解创建的mock将被注入到用该实例中.
     */
    @InjectMocks
    private LoginService service;

    /**
     * 创建一个Mock并且注入到InjectMocks
     */
    @Mock
    private LoginRepository repo;

    private LoginForm form = new LoginForm("foo", "bar");

    /**
     * {@link ArgumentMatchers#any()}Matches any object of given type, excluding nulls.
     * 此处输入任意LoginForm类型的object持久层repo都会返回true除了null.
     */
    @Test
    public void testLoginTrue() {

        // 实际调用了service的login方法
        when(repo.login(any(LoginForm.class))).thenReturn(true);
        assertTrue(service.login(form));

        // 验证仅仅模拟调用了repo的login方法
        verify(repo, atLeast(1)).login(form);

        // 没有模拟调用repo的其他方法
        verifyNoMoreInteractions(repo);
    }

    /**
     * 此处输入任意LoginForm类型的object持久层repo都会返回false除了null.
     */
    @Test
    public void testLoginFalse() {
        when(repo.login(any(LoginForm.class))).thenReturn(false);
        assertFalse(service.login(form));

        verify(repo, times(1)).login(form);
        verifyNoMoreInteractions(repo);
    }

    /**
     * 登录两次抛出异常
     */
    @Test(expected = ApiException.class)
    public void testLoginTwice() {
        when(repo.login(form)).thenReturn(true);
        service.login(form);
        service.login(form);
    }
}