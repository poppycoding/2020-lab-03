package com.xlaser4j.junit;

import cn.hutool.core.lang.Console;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:50
 * @description: 模拟登录控制器
 * @modified: Elijah.D
 */
public class LoginController {
    private LoginService service;

    /**
     * 登录逻辑
     *
     * @param form param
     * @return true/false
     */
    public String login(LoginForm form) {
        Console.log("LoginController.login =====>> " + form);

        try {
            if (form == null) {
                return "ERROR";
            } else if (service.login(form)) {
                return "OK";
            } else {
                return "KO";
            }
        } catch (Exception e) {
            return "ERROR";
        }
    }

    /**
     * 登出逻辑
     *
     * @param form param
     */
    public void logout(LoginForm form) {
        Console.log("LoginController.logout =====>> " + form);

        service.logout(form);
    }
}
