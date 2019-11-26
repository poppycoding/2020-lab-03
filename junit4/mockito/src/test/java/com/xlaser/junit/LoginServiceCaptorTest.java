package com.xlaser.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * 在某些场景中,不仅要对方法的返回值和调用逻辑进行验证,同时需要验证一系列交互后所传入方法的参数,这个时候适合
 * 使用{@link ArgumentCaptor}参数捕获器来捕获传入参数的正确与否进行验证.
 * <p>
 * Api:
 * argument.capture() 捕获方法参数.
 * argument.getValue() 获取方法参数值,如果方法进行了多次调用,它将返回最后一个参数值.
 * argument.getAllValues() 方法进行多次调用后,返回多个参数值.
 * <p>
 * 在某种程度上参数捕获器和参数匹配器{@link ArgumentMatchers#any()}功能相似,都用来确保传入mock对象参数的正确性;
 * 然而,当自定义的参数匹配器的难以复用时,用参数捕获器会更合适,只需对参数交互完成的最后进行验证.
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 13:39
 * @description: 测试captor的使用
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceCaptorTest {
    /**
     * Use it to capture argument values for further assertions{@link ArgumentCaptor}参数捕获器
     * ArgumentCaptor argument = ArgumentCaptor.forClass(Class)
     * <p>
     * ﻿1.通过注解构建ArgumentCaptor需要传入需要被捕获变量LoginForm.class.
     * 2.verify调用Mock对象的方法中调用captor.capture()来捕获执行该方法时该变量的值.
     * 3.进行值的验证,通过captor.getValue()得到该对象执行时的值.
     */
    @Captor
    ArgumentCaptor<LoginForm> captor;

    /**
     * Note that @InjectMocks will only inject mocks/spies created using the @Spy or @Mock annotation
     * 创建一个实例，其余用@Mock（或@Spy）注解创建的mock将被注入到用该实例中.
     */
    @InjectMocks
    private LoginService service;

    /**
     * 创建一个Mock并且注入到InjectMocks
     */
    @Mock
    private LoginRepository repo;

    /**
     * 此处验证经过service的逻辑之后,form的值不应该改变,可以手动在service中加入setUsername("error"),
     * 会发现验证失败,简单来说captor就是校验参数经过处理之后,最终的状态是否符合预期.
     */
    @Test
    public void testArgumentCaptor() {
        service.login(new LoginForm("foo", "bar"));
        verify(repo).login(captor.capture());
        assertEquals("foo", captor.getValue().getUsername());
        assertEquals("bar", captor.getValue().getPassword());
    }
}