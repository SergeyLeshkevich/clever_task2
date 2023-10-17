package by.leshkevich.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    String[] arrayStr;

    @BeforeEach
    void initArray() {
        arrayStr = new String[]{"1", "str"};
    }

    @Test
    void isNotAllPositiveNumbers() {

        boolean result = Utils.isAllPositiveNumbers(arrayStr);
        assertFalse(result);
    }
}