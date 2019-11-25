package com.xlaser.junit.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @package: com.xlaser.junit.category
 * @author: Elijah.D
 * @time: 2019/11/25 10:38
 * @description: 测试categories中使用suite
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@RunWith(Categories.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses({CategoryA.class, CategoryB.class, CategoryC.class})
public class TestCategorySuite {

    // 带有FastTests的categories将不会被执行
}
