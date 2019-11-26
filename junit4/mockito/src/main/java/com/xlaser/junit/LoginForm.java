package com.xlaser.junit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:36
 * @description: 用户表单信息
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginForm {
    public String username;

    public String password;
}
