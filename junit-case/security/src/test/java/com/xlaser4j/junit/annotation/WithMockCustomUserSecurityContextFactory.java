package com.xlaser4j.junit.annotation;

import com.xlaser4j.junit.model.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.test.context.support.WithSecurityContextFactory;

/**
 * @package: com.xlaser4j.junit.annotation
 * @author: Elijah.D
 * @time: 2020/2/20 22:26
 * @description:
 * @modified: Elijah.D
 */
public class WithMockCustomUserSecurityContextFactory implements WithSecurityContextFactory<WithMockCustomUser> {
    /**
     * {@link org.springframework.security.test.context.support.WithSecurityContextTestExecutionListener}
     *
     * @param customUser
     * @return
     */
    @Override
    public SecurityContext createSecurityContext(WithMockCustomUser customUser) {
        SecurityContext context = SecurityContextHolder.createEmptyContext();

        User principal = new User("", customUser.username());
        Authentication auth = new UsernamePasswordAuthenticationToken(principal, "password", principal.getAuthorities());
        context.setAuthentication(auth);
        return context;
    }
}