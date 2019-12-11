package com.xlaser.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * AutoConfigureMockMvc: Annotation that can be applied to a test class to enable and configure
 * auto-configuration of {@link MockMvc} 开启自动扫描装配mockMvc
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/12/11 15:30
 * @description: 测试mvc
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
class MvcTest {
    /**
     * Spring MVC test support
     */
    @Autowired
    MockMvc mockMvc;

    @Test
    void testMvc() throws Exception {
        mockMvc.perform(get("/index.html"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/html"))
                .andExpect(content().string(containsString("index")));
    }
}
