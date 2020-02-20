package com.xlaser4j.junit;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.lang.Console;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:41
 * @description: 登录service
 * @modified: Elijah.D
 */
public class LoginService {
    private LoginRepository repo;

    private List<String> logs = new ArrayList<>();

    /**
     * 登录逻辑
     *
     * @param form param
     * @return true/false
     */
    boolean login(LoginForm form) {
        Console.log("LoginService.login =====>> " + form);

        // 登录检测,空以及二次登录过滤
        checkForm(form);
        String username = form.getUsername();
        if (logs.contains(username)) {
            throw new ApiException(username + " already logged");
        }

        // 登录repo逻辑
        boolean isLogin = repo.login(form);
        if (isLogin) {
            logs.add(username);
        }
        return isLogin;
    }

    /**
     * 登出逻辑
     *
     * @param form param
     */
    void logout(LoginForm form) {
        Console.log("LoginService.logout =====>> " + form);

        // 登录检测,空以及二次登录过滤
        checkForm(form);
        String username = form.getUsername();
        if (!logs.contains(username)) {
            throw new ApiException(username + " not logged");
        }

        // 登出
        logs.remove(username);
    }

    /**
     * 参数预检
     *
     * @param form param
     */
    private void checkForm(LoginForm form) {
        assert form != null;
        assert form.getUsername() != null;
        assert form.getPassword() != null;
    }
}
