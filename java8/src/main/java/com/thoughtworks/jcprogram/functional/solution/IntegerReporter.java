package com.thoughtworks.jcprogram.functional.solution;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;
import static java.lang.String.join;
import static java.util.Arrays.asList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        List<String> numbersAsStrings = numbers.stream()
                .filter(number -> number > 4)
                .map(number -> sqrt(number))
                .map(number -> number.intValue())
                .map(number -> number.toString())
                .collect(Collectors.<String>toList());

        return join(", ", numbersAsStrings);
    }

}
