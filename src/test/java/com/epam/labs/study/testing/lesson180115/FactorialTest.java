package com.epam.labs.study.testing.lesson180115;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @ParameterizedTest
    @CsvSource({"2,2", "3,6", "4,24"})
    public void parametrTestFact(int params, long ex) {
        assertEquals(ex, Factorial.fact(params));
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -3, -4})
    void exceptionTestFact(int k) {
        assertThrows(IllegalArgumentException.class, () -> Factorial.fact(k), "a message");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 1, 1})
    @Disabled
    void disabledTestFact(int k) {
        assertEquals(12, 21);
    }


}