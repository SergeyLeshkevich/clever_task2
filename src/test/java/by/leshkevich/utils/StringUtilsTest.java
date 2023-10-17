package by.leshkevich.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        boolean result = StringUtils.isPositiveNumber("1");
        assertTrue(result);
    }
}