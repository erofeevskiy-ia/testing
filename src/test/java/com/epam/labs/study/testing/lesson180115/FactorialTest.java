package com.epam.labs.study.testing.lesson180115;

import org.junit.jupiter.api.function.Executable;
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
    @ValueSource(ints = {-2,-3,-4})
    void exceptionTestFact(int k) {
        Executable executable = ()->Factorial.fact(k);
        assertThrows(IllegalArgumentException.class, executable, "a message");
    }

}