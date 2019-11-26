package com.xlaser.junit;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:49
 * @description: 异常模拟
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ApiException(String message) {
        super(message);
    }
}
