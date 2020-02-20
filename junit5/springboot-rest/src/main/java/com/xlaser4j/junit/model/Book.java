package com.xlaser4j.junit.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.xlaser4j.junit.model
 * @author: Elijah.D
 * @time: 2019/12/6 14:24
 * @description:
 * @modified: Elijah.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int index;

    private String name;

    private String author;

    private LocalDate publishDate;
}
