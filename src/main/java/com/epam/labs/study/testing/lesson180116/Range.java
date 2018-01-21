package com.epam.labs.study.testing.lesson180116;

import java.util.Iterator;
import java.util.List;

public class Range implements RangeInterface {
    @Override
    public boolean isBefore(Range otherRange) {

        return false;
    }

    @Override
    public boolean isAfter(Range otherRange) {
        return false;
    }

    @Override
    public boolean isConcurrent(Range otherRange) {
        return false;
    }

    @Override
    public long getLowerBound() {
        return 0;
    }

    @Override
    public long getUpperBound() {
        return 0;
    }

    @Override
    public boolean contains(long value) {
        return false;
    }

    @Override
    public List<Long> asList() {
        return null;
    }

    @Override
    public Iterator<Long> asIterator() {
        return null;
    }
}
