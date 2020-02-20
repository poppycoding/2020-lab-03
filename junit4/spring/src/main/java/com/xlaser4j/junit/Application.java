package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/26 14:23
 * @description: context
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
