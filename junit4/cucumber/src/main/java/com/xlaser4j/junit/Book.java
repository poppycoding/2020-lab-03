package com.xlaser4j.junit;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @package: com.xlaser4j.junit
 * @author: Elijah.D
 * @time: 2019/11/25 11:01
 * @description: book
 * @modified: Elijah.D
 */
@Data
@AllArgsConstructor
public class Book {
    private String title;

    private String author;

    private Date published;
}
