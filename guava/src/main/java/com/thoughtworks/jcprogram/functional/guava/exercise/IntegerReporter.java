package com.thoughtworks.jcprogram.functional.guava.exercise;

import java.util.List;

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
        return "";
    }

}
