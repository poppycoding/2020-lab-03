package com.xlaser.junit;

import cn.hutool.core.lang.Console;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:23
 * @description: context
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@ComponentScan
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MsgService service = context.getBean(MsgService.class);
        Console.log("【service.msg】:{}", service.getMsg());
    }
}
