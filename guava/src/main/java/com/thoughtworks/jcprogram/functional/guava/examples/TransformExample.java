package com.thoughtworks.jcprogram.functional.guava.examples;

import com.google.common.base.Function;

import java.util.List;

import static com.google.common.collect.Lists.transform;

public class TransformExample {
    private Integer numberToDivideBy;

    public TransformExample(Integer numberToDivideBy) {
        this.numberToDivideBy = numberToDivideBy;
    }

    public List<Integer> divide(List<Integer> numbersToDivide) {
        return transform(numbersToDivide, new IntegerIntegerFunction());
    }

    private class IntegerIntegerFunction implements Function<Integer, Integer> {
        public Integer apply(Integer integer) {
            return integer/numberToDivideBy;
        }
    }
}
