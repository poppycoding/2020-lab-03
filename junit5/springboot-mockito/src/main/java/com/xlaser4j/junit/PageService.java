package com.xlaser4j.junit;

import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/12/11 15:25
 * @description:
 * @modified: Elijah.D
 */
@Service
public class PageService {
    public String getPage() {
        return "/index.html";
    }
}
