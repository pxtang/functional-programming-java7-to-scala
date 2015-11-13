package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {


    public static void main(String[] args) {
        List<Integer> numbers = newArrayList(1, 9, 4, 16, 4);

        System.out.println("------------ Guava: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        Collection<Integer> greaterThanFour = filter(numbers, new GreaterThanFourPredicate());
        Collection<Integer> rootedNumbers = transform(greaterThanFour, new SqrtFunction());

        return Joiner.on(", ").join(rootedNumbers);
    }

    private static class GreaterThanFourPredicate implements Predicate<Integer> {
        public boolean apply(Integer integer) {
            return integer > 4;
        }
    }

    private static class SqrtFunction implements Function<Integer, Integer> {
        @Override
        public Integer apply(Integer integer) {
            return (int) Math.sqrt(integer);
        }
    }

}

