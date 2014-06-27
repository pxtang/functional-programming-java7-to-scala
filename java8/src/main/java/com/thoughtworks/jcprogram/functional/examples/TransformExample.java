package com.thoughtworks.jcprogram.functional.examples;

import java.util.List;
import java.util.stream.Collectors;

public class TransformExample {
    private Integer numberToDivideBy;

    public TransformExample(Integer numberToDivideBy) {
        this.numberToDivideBy = numberToDivideBy;
    }

    public List<Integer> divide(List<Integer> numbersToDivide) {
        return numbersToDivide
                .stream()
                .map(integer -> integer / numberToDivideBy)
                .collect(Collectors.<Integer>toList());
    }
}
