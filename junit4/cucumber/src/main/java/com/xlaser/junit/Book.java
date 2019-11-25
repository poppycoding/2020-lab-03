package com.xlaser.junit;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @package: com.xlaser.junit
 * @author: Elijah.D
 * @time: 2019/11/25 11:01
 * @description: book
 * @copyright: Copyright(c) 2019
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
@AllArgsConstructor
public class Book {
    private String title;

    private String author;

    private Date published;
}
