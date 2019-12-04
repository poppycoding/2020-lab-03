package com.xlaser.junit.platform.runner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @package: com.xlaser.junit.junit4
 * @author: Elijah.D
 * @time: 2019/12/3 16:31
 * @description: 兼容junit4中的runner
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.xlaser.junit.platform.suite"})
public class JUnitPlatformTest {

    // 等价于junit4中的suite功能
}
