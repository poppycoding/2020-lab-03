package com.xlaser.junit.platform.rule;

import java.io.File;
import java.io.IOException;

import cn.hutool.core.lang.Console;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.TemporaryFolder;

/**
 * @package: com.xlaser.junit.platform.rule
 * @author: Elijah.D
 * @time: 2019/12/4 12:09
 * @description: 测试ErrorCollector
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@EnableRuleMigrationSupport
class TemporaryFolderRuleTest {
    /**
     * org.junit.internal.runners.rules.ValidationError: The @Rule 'folder' must be public.
     * <p>
     * 注意junit5中可以设置为not public,但是要手动创建删除临时文件,如:beforeEach/afterEach,因为junit4中
     * 所有rule以及case必须是public,也可以与junit4保持一致,方便迁移调用.
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * 测试创建临时文件以及文件夹,断点查看是否成功
     *
     * @throws IOException
     */
    @Test
    void testUsingTempFolder() throws IOException {
        File createdFile = folder.newFile("temp.txt");
        Console.log("【createdFile】:{}", createdFile);

        File createdFolder = folder.newFolder("subfolder");
        Console.log("【createdFolder】:{}", createdFolder);
    }
}
