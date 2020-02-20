package com.xlaser4j.junit.enumeration;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

/**
 * @package: com.xlaser4j.junit.enumeration
 * @author: Elijah.D
 * @time: 2019/12/5 16:09
 * @description: 自定义一个转换器, 显式调用转换器
 * @modified: Elijah.D
 */
public class StringArgumentConvert extends SimpleArgumentConverter {
    /**
     * Convert the supplied {@code source} object into to the supplied {@code targetType}.
     * 把source转换为的类型转换为targetType,其中source是数据源中的数据,type是case中的参数类型.
     * <p>
     * eg: source是season的枚举值,target是参数season的类型String
     * EnumSource(Season.class)
     * void testSeasonConvert(@ConvertWith(StringArgumentConvert.class) String season)
     *
     * @param source     to convert;
     * @param targetType should be converted into
     * @return converted object
     * @throws ArgumentConversionException
     */
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        return String.valueOf(source);
    }
}
