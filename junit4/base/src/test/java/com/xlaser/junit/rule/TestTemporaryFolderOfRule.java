package com.xlaser.junit.rule;

import java.io.File;
import java.io.IOException;

import cn.hutool.core.lang.Console;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * @package: com.xlaser.junit.rule
 * @author: Elijah.D
 * @time: 2019/11/19 13:51
 * @description: 测试temporary folder
 * @copyright: Copyright© 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
public class TestTemporaryFolderOfRule {
    /**
     * 临时创建文件或者文件夹.无论测试通过与否,都会删除这个临时创建的文件,即使删除失败也不会抛出异常!
     *
     * @see org.junit.rules.ExternalResource
     * @see TestExternalResourceOfRule
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * 测试创建临时文件以及文件夹,断点查看是否成功
     *
     * @throws IOException
     */
    @Test
    public void testUsingTempFolder() throws IOException {
        File createdFile = folder.newFile("temp.txt");
        Console.log("【createdFile】:{}", createdFile);

        File createdFolder = folder.newFolder("subfolder");
        Console.log("【createdFolder】:{}", createdFolder);
    }
}
