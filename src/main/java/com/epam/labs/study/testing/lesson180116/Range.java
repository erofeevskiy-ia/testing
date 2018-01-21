package com.epam.labs.study.testing.lesson180116;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Range implements RangeInterface {

    private long lowBound;
    private long upperBound;

    public Range(long lowBound, long upperBound) {
        if (lowBound > upperBound) throw new IllegalArgumentException("Mistake: lowBound > upperBound");
        this.lowBound = lowBound;
        this.upperBound = upperBound;
    }

    private class Itr implements Iterator<Long> {
        long cursor = getLowerBound();

        @Override
        public boolean hasNext() {
            return cursor<=getUpperBound();
        }

        @Override
        public Long next() {
            return cursor++;
        }
    }

    @Override
    public boolean isBefore(Range otherRange) {

        return this.upperBound < otherRange.getLowerBound();
    }

    @Override
    public boolean isAfter(Range otherRange) {
        return this.lowBound > otherRange.getUpperBound();
    }

    @Override
    public boolean isConcurrent(Range otherRange) {
        return false;
    }

    @Override
    public long getLowerBound() {
        return this.lowBound;
    }

    @Override
    public long getUpperBound() {
        return this.upperBound;
    }

    @Override
    public boolean contains(long value) {
        return (value >= this.getLowerBound() && value<=this.getUpperBound());
    }

    @Override
    public List<Long> asList() {
        List<Long> list = new ArrayList<>();
        Iterator<Long> it = asIterator();
        while(it.hasNext())
            list.add(it.next());
        return list;
    }

    @Override
    public Iterator<Long> asIterator() {
        return new Itr();
    }
}
