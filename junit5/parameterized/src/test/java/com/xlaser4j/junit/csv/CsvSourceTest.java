package com.xlaser4j.junit.csv;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @package: com.xlaser4j.junit.csv
 * @author: Elijah.D
 * @time: 2019/12/5 13:59
 * @description:
 * @modified: Elijah.D
 */
class CsvSourceTest {
    /**
     * csv data source
     *
     * @param first
     * @param two
     * @param three
     */
    @ParameterizedTest
    @DisplayName("CsvSourceTest: TestCsv")
    @CsvSource({"csv,1-0,1", "csv,1-1,2", "csv,1-2,3"})
    void testCsvSource(String first, String two, int three) {
        assertAll("CsvSourceTest: csv",
                () -> assertEquals("csv", first),
                () -> assertThat(two, StringContains.containsString("1-")),
                () -> assertTrue(three > 0)
        );
    }

    /**
     * csv file data source
     *
     * @param first
     * @param two
     * @param three
     */
    @ParameterizedTest
    @DisplayName("CsvSourceTest: TestCsvFile")
    @CsvFileSource(resources = "/csv/person.csv")
    void testCsvFileSource(String first, int two, String three) {
        assertAll("CsvSourceTest: csvFile",
                () -> assertNotNull(first),
                () -> assertTrue(two > 2014),
                () -> assertThat(three, StringContains.containsString("job-"))
        );
    }
}
