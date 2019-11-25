package com.xlaser.junit;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * CucumberOptions可以设置一些参数eg:{@link CucumberOptions#plugin()}修改控制台参数格式.
 *
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 15:03
 * @description: test
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class CucumberTest {
}
