package com.epam.labs.study.testing.lesson180115;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {
    @ParameterizedTest
    @CsvSource({"2,2,4", "3,6,18", "4,4,16"})
    void multiplicationBaseTest(int a, int b,long ans) {
        assertEquals(ans,MathOperation.multiplication(a,b));
    }

    @ParameterizedTest
    @CsvSource({"100,-2,-50", "3,6,0.5", "0,1,0"})
    void divisionBaseTest(int a, int b, int ans) {
        assertEquals(ans,MathOperation.division(a,b));
    }

    @ParameterizedTest
    @ValueSource(ints = {-0,0})
    void divisionExceptionTest(int k){
        assertThrows(IllegalArgumentException.class, () -> MathOperation.division(1,k), "ALL RIGHT");
    }
}