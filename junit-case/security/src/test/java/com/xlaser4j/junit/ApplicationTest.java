package com.xlaser4j.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2020/2/20 21:26
 * @description:
 * @modified: Elijah.D
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ApplicationTest {
    /**
     * We have seen that @WithMockUser is an excellent choice if we are not using a custom
     * Authentication principal.
     * <p>
     * Next we discovered that @WithUserDetails would allow us to use a custom UserDetailsService to
     * create our Authentication principal but required the user to exist.
     * <p>
     * We will now see an option that allows the most flexibility. We can create our own annotation
     * that uses the @WithSecurityContext to create any SecurityContext we want. For example, we
     * might create an annotation named @WithMockCustomUser as shown below:
     */
    @Test
    void contextTest() {
        System.out.println("三种方式mock security中的username等认证信息");
    }
}
