package com.xlaser4j.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2020/2/20 21:21
 * @description:
 * @modified: Elijah.D
 */
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
