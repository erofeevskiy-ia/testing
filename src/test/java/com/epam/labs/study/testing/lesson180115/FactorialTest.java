package com.epam.labs.study.testing.lesson180115;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @ParameterizedTest
    @CsvSource({"2,2", "3,6", "4,24"})
    public void parametrTestFact(int params, long ex) {
        assertEquals(ex, Factorial.fact(params));
    }

}