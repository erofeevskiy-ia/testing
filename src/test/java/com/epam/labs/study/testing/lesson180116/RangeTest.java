package com.epam.labs.study.testing.lesson180116;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RangeTest {
    private Range rMin10_100 = new Range(-10, 100);
    private Range rMin100_Min90 = new Range(-100, -90);
    private Range r101_150 = new Range(101, 150);
    private Range r1_2 = new Range(1, 2);

    @Test
    void exceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> new Range(10, -10), "good");
        assertThrows(IllegalArgumentException.class, () -> new Range(Long.MAX_VALUE, Long.MIN_VALUE), "good2");
    }

    @Test
    void isBeforeTest() {
        assertEquals(true, r1_2.isBefore(r101_150));
        assertEquals(false, r1_2.isBefore(rMin10_100));
    }

    @Test
    void isAfterTest() {
        assertEquals(true, r101_150.isAfter(r1_2));
        assertEquals(false, r1_2.isAfter(r1_2));
        assertEquals(true, r1_2.isAfter(rMin100_Min90));
    }

    @Test
    void isConcurrent() {
        assertEquals(true, true);
    }

    @Test
    void getLowerBound() {
        assertEquals(1, r1_2.getLowerBound());
        assertEquals(-10, rMin10_100.getLowerBound());
    }

    @Test
    void getUpperBound() {
        assertEquals(2, r1_2.getUpperBound());
        assertEquals(100, rMin10_100.getUpperBound());
    }

    @Test
    void contains() {
        assertEquals(true, rMin10_100.contains(5));
        assertEquals(false, rMin10_100.contains(5000));
    }

    @Test
    void asList() {

    }

    @Test
    void asIterator() {
    }

}