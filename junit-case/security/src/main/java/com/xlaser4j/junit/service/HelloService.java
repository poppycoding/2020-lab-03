package com.xlaser4j.junit.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * @package: com.xlaser4j.junit.service
 * @author: Elijah.D
 * @time: 2020/2/20 21:19
 * @description:
 * @modified: Elijah.D
 */
@Service
public class HelloService {
    @PreAuthorize("authenticated")
    public String getMessage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello " + authentication;
    }
}
