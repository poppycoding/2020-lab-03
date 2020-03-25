package com.xlaser4j.chapter4.case1;

import com.xlaser4j.junit.chapter4.case1.Grep;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @package: com.xlaser4j.chapter4.case1
 * @author: Elijah.D
 * @time: 2020/3/25 10:21
 * @description: Code Smell-基本断言问题
 * @modified: Elijah.D
 */
public class GrepTest {
    /**
     * 输出结果应该包含正在逐行查找的文件名加行号
     */
    Grep grep = new Grep();

    /**
     * Note: <b>断言的目标不清楚,基本抽象层次太低,需要稍微思考才能看出查找字符串index,-1等魔法数字的问题</b>
     */
    @Test
    public void outputHasLineNumbers() {
        String content = "1st match on #1\nand\n2nd match on #3";
        String out = grep.grep("match", "test.txt", content);

        assertTrue(out.indexOf("test.txt:1 1st match") != -1);
        assertTrue(out.indexOf("test.txt:3 2st match") != -1);
    }

    /**
     * Note: <b>通过assertThat稍微减轻思考的负担,去掉不等于的比较问题</b>
     */
    @Test
    public void outputHasLineNumbers1() {
        String content = "1st match on #1\nand\n2nd match on #3";
        String out = grep.grep("match", "test.txt", content);

        assertThat(out.indexOf("test.txt:1 1st match"), is(not(-1)));
        assertThat(out.indexOf("test.txt:3 2st match"), not(-1));
    }

    /**
     * Note: <b>通过assertTrue但是去掉index这种标准的java api调用,减少阅读代码的认知负担</b>
     */
    @Test
    public void outputHasLineNumbers3() {
        String content = "1st match on #1\nand\n2nd match on #3";
        String out = grep.grep("match", "test.txt", content);

        assertTrue(out.contains("test.txt:1 1st match"));
        assertTrue(out.contains("test.txt:3 2st match"));
    }

    /**
     * Note: <b>通过assertThat更加语言化的断言</b>
     * <p>
     * 看起来比3的改进冗长,但是测试的性质和宗旨是更注重可读性和清晰度,其次才是代码的重复度和性能;
     * 额外的冗长或许更有利于表现力,可读性和可维护性.
     */
    @Test
    public void outputHasLineNumbers4() {
        String content = "1st match on #1\nand\n2nd match on #3";
        String out = grep.grep("match", "test.txt", content);

        assertThat(out.contains("test.txt:1 1st match"), is(true));
        assertThat(out.contains("test.txt:3 2st match"), is(true));
    }

    /**
     * Note: <b>通过assertThat更加语言化的断言,再次改进</b>
     */
    @Test
    public void outputHasLineNumbers5() {
        String content = "1st match on #1\nand\n2nd match on #3";
        String out = grep.grep("match", "test.txt", content);

        assertThat(out, containsString("test.txt:1 1st match"));
        assertThat(out, containsString("test.txt:3 2st match"));
    }
}
