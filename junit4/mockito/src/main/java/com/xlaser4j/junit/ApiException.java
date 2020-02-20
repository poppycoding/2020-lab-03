package com.xlaser4j.junit;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/25 16:49
 * @description: 异常模拟
 * @modified: Elijah.D
 */
public class ApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ApiException(String message) {
        super(message);
    }
}
