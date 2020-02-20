package com.xlaser4j.junit.register;

/**
 * @package: com.xlaser4j.junit.register
 * @author: Elijah.D
 * @time: 2019/12/6 12:19
 * @description:
 * @modified: Elijah.D
 */
public class CustomException extends RuntimeException {
    private static final long serialVersionUID = 3674088323587897556L;

    /**
     * Constructs an {@code CustomException} with no detail message.
     */
    public CustomException() {
        super();
    }

    /**
     * Constructs an {@code CustomException} with the specified detail message.
     *
     * @param s the detail message.
     */
    public CustomException(String s) {
        super(s);
    }
}
