package com.xlaser4j.chapter3.case2;

import com.xlaser4j.junit.chapter3.case2.Internet;
import com.xlaser4j.junit.chapter3.case2.Translator;
import org.hamcrest.core.StringContains;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.*;

/**
 * @package: com.xlaser4j.chapter3.case2
 * @author: Elijah.D
 * @time: 2020/3/24 17:06
 * @description:
 * @modified: Elijah.D
 */
public class TestTranslator {
    protected Mockery context;

    @Before
    public void createMockery() {
        context = new JUnit4Mockery();
    }

    @Test
    @Ignore
    public void usesInternetForTranslationByJMock() {
        Internet internet = context.mock(Internet.class);
        context.checking(new Expectations() {{
            oneOf(internet).get(with(StringContains.containsString("langpair=en%7Cfi")));
            will(returnValue("{\"translatedText\":\"kukka\"}"));
        }});
        Translator translator = new Translator(internet);

        String translation = translator.translate("");

        Assert.assertEquals("kukka", translation);
    }

    @Test
    @Ignore
    public void usesInternetForTranslationByMockito() {
        Internet internet = mock(Internet.class);
        when(internet.get(contains("langpair=en%7Cfi"))).thenReturn("{\"translatedText\":\"kukka\"}");
        Translator translator = new Translator(internet);

        String translation = translator.translate("");

        Assert.assertEquals("kukka", translation);
        verify(internet).get(anyString());
    }
}
