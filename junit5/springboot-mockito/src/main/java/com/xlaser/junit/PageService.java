package com.xlaser.junit;

import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/12/11 15:25
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Service
public class PageService {
    public String getPage() {
        return "/index.html";
    }
}
