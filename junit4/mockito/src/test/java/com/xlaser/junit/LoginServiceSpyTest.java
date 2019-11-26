package com.xlaser.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 使用@Mock生成的类,所有方法都不是真实的方法,而且返回值都是NULL,所以需要添加mock语句也就是打桩(stubbed)指定返回.
 * eg: mock.service返回null,添加mock打桩语句thenReturn强制返回"mock"
 * when(mock.service()).thenReturn("mock");
 * <p>
 * 使用@Spy生成的类,所有方法都是真实方法,返回值都是和真实方法一样的,实际调用了真实逻辑内容,当然打桩也返回实际实现,
 * 也即是:果不打桩,默认执行真实的方法,如果打桩则返回桩实现,其中两种桩实现如下:
 * when(spy.service()).thenReturn("spy!");做了真实调用,会先执行service方法,然后返回了指定桩的结果.
 * doReturn("spy!").when(spy).service();不做真实调用,不会执行service方法,直接放回桩结果"spy!".
 * <p>
 * 总结:mock方法和spy方法都可以对对象进行mock,但是前者是接管了对象的全部方法,所有方法都不进行真实调用,而spy是将有
 * 桩实现（stubbing）的调用进行mock,其余方法仍然是实际调用,注意上述两种不同的桩实现.
 * <p>
 * 注:mock对象可以通过{@link Mockito#doCallRealMethod()}进行实际方法调用.
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 11:16
 * @description: 测试spy与mock区别
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceSpyTest {
    /**
     * Note that @InjectMocks will only inject mocks/spies created using the @Spy or @Mock annotation
     * 创建一个实例,其余用@Mock（或@Spy）注解创建的mock将被注入到用该实例中.
     */
    @InjectMocks
    private LoginService service;

    /**
     * Instance for spying is created by calling constructor explicitly.
     * Foo spyOnFoo = new Foo("argument")可以通过{@spy}注解调用显式有参构造
     * <p>
     * Instance for spying is created by mockito via reflection (only default constructors supported)
     * LoginRepository repo{@spy}注解是通过mockito反射调用spy对象的无参构造
     * <p>
     * eg:通过mockito调用spy
     * Foo spyOnFoo = Mockito.spy(new Foo("argument"));
     * Bar spyOnBar = Mockito.spy(new Bar());
     */
    @Spy
    private LoginRepository repo;

    /**
     * 实际调用了repo
     */
    @Test
    public void testServiceLoginOk() {
        assertTrue(service.login(new LoginForm("admin", "admin")));
    }

    /**
     * 实际调用了repo
     */
    @Test
    public void testServiceLoginBad() {
        assertFalse(service.login(new LoginForm("foo", "bar")));
    }
}