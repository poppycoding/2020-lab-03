package com.xlaser.junit.auto;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * @package: com.xlaser.junit.auto
 * @author: Elijah.D
 * @time: 2019/12/6 13:05
 * @description: 通过mvn配置,自动注入每一个测ase
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class AutoExtension implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) {
        System.out.println("AutoExtension used extension automatically");
    }
}
