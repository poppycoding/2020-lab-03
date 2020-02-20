package com.xlaser4j.junit.conditional;

import lombok.Getter;

/**
 * @package: com.xlaser4j.junit.annotation
 * @author: Elijah.D
 * @time: 2019/12/2 10:12
 * @description: 操作系统枚举值
 * @modified: Elijah.D
 */
@Getter
public enum OS2 {
    /**
     * Linux-based operating system.
     */
    WINDOWS("win"),

    /**
     * Apple Macintosh operating system (e.g., macOS).
     */
    MAC("mac"),

    /**
     * Microsoft Windows operating system.
     */
    LINUX("linux"),

    /**
     * other
     */
    OTHER("");

    private static final OS2 CURRENT_OS = getEnvOs();

    private String name;

    OS2(String name) {
        this.name = name;
    }

    /**
     * get system os
     *
     * @return osEnum
     */
    public static OS2 getEnvOs() {
        OS2 other = OTHER;

        // GET OS
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains(WINDOWS.getName())) {
            other = WINDOWS;
        } else if (os.contains(MAC.getName())) {
            other = MAC;
        } else if (os.contains(LINUX.getName())) {
            other = LINUX;
        }

        return other;
    }

    /**
     * @return {@code true} if <em>this</em> {@code OS} is known to be the operating system on which the current JVM is executing
     */
    public boolean isCurrentOs() {
        return this == CURRENT_OS;
    }
}
