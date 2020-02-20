package com.xlaser4j.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * 与junit4中用法一致,只是需要使用ExtendWith开启mock支持即可
 *
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/12/11 15:28
 * @description: 测试mock
 * @modified: Elijah.D
 */
@ExtendWith(MockitoExtension.class)
class MockitoTest {
    @InjectMocks
    private MockitoController controller;

    @Mock
    private PageService service;

    @Test
    void testMockito() {
        when(service.getPage()).thenReturn("/custom-page.html");
        assertEquals("/custom-page.html", controller.index());
        verify(service, times(1)).getPage();
    }
}
