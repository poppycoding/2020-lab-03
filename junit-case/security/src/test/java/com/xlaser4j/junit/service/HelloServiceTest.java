package com.xlaser4j.junit.service;

import com.xlaser4j.junit.ApplicationTest;
import com.xlaser4j.junit.annotation.WithMockCustomUser;
import com.xlaser4j.junit.annotation.WithMockUserDetails;
import com.xlaser4j.junit.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2020/2/20 21:30
 * @description:
 * @modified: Elijah.D
 */
public class HelloServiceTest extends ApplicationTest {
    @Autowired
    HelloService service;

    /**
     * 没有登陆测试
     */
    @Test
    void test1() {
        Assertions.assertThrows(AuthenticationCredentialsNotFoundException.class, () -> service.getMessage());
    }

    /**
     * mock默认: username-"user", password-"password", roles-"ROLE_USER"
     */
    @Test
    @WithMockUser
    void test2() {
        System.out.println(service.getMessage());
        User principal = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }

    /**
     * 自定义username,roles
     */
    @Test
    @WithMockUser(username = "elijah", roles = {"USER", "ADMIN"})
    void test3() {
        System.out.println(service.getMessage());
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }

    /**
     * mock userDetails: 默认username: user
     */
    @Test
    @WithUserDetails
    void test4() {
        System.out.println(service.getMessage());
        User principal = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }

    /**
     * mock userDetails: 自定义username
     */
    @Test
    @WithUserDetails("elijah")
    void test5() {
        System.out.println(service.getMessage());
        User principal = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }

    /**
     * 自定义User注解
     */
    @Test
    @WithMockCustomUser(username = "elijah")
    void test6() {
        System.out.println(service.getMessage());
        User principal = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }

    /**
     * 自定义UserDetails注解
     * <p>
     * TODO:
     */
    @Test
    @Disabled
    @WithMockUserDetails
    void test7() {
        System.out.println(service.getMessage());
        UserDetails principal = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }
}
