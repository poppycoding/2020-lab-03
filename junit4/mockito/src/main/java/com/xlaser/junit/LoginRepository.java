package com.xlaser.junit;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.lang.Console;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:37
 * @description:
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class LoginRepository {
    private Map<String, String> data;

    /**
     * init mock data
     */
    public LoginRepository() {
        data = new HashMap<>();
        data.put("admin", "admin");
        data.put("test", "test");
        data.put("dev", "dev");
    }

    /**
     * mock logic logic
     *
     * @param form param
     * @return true/false
     */
    public boolean login(LoginForm form) {
        Console.log("LoginRepository.login =====>> " + form);

        // CHECK
        String username = form.getUsername();
        String password = form.getPassword();
        return data.containsKey(username) && data.get(username).equals(password);
    }
}
