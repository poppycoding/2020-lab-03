package com.xlaser.junit.injection;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

/**
 * for the current container or test to the reporting infrastructure.
 * 暂时未知,或许是为测试报告增加额外的可读性描述信息.
 *
 * @package: com.xlaser.junit.injection
 * @author: Elijah.D
 * @time: 2019/12/4 12:30
 * @description: 注入TestReporter
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
class TestReporterTest {
    /**
     * Publish the supplied map of key-value pairs as a <em>report entry</em>.
     *
     * @param reporter
     */
    @Test
    void publishValue(TestReporter reporter) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "john");
        map.put("surname", "doe");
        reporter.publishEntry(map);
    }

    /**
     * Publish the supplied key-value pair as a <em>report entry</em>.
     *
     * @param reporter
     */
    @Test
    void publishKeyValue(TestReporter reporter) {
        reporter.publishEntry("key", "value");
    }

    /**
     * Publish the supplied value as a <em>report entry</em>.
     *
     * @param reporter
     */
    @Test
    void publishMap(TestReporter reporter) {
        reporter.publishEntry("publishValue");
    }
}
