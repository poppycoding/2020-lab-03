package com.xlaser.junit;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:33
 * @description: application
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
@SpringBootApplication
public class Application {
    @Autowired
    private MsgService service;

    public static void main(String[] args) {
        /// new SpringApplication(Application.class).run(args);
        SpringApplication.run(Application.class);
    }

    @PostConstruct
    private void setup() {
        log.info("*** {} ***", service.getMsg());
    }
}
