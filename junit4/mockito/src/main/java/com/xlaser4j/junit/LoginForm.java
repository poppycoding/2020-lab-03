package com.xlaser4j.junit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:36
 * @description: 用户表单信息
 * @modified: Elijah.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginForm {
    public String username;

    public String password;
}
