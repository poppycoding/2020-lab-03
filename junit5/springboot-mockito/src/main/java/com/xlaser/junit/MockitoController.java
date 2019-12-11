package com.xlaser.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/12/11 15:26
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RestController
public class MockitoController {
    @Autowired
    private PageService service;

    @GetMapping("/")
    public String index() {
        return service.getPage();
    }
}
