package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = newArrayList("Bill", "Archer", "Lana");

        System.out.println("------------ Guava: StringReducer ------------");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        Collection<String> validStrings = filter(strings, new FourLenStrs());
        Collection<String> firstChars = transform(validStrings, new getFirstChars());
        return Joiner.on("").join(firstChars);
    }

    private static class getFirstChars implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input.substring(0, 1);
        }
    }

    private static class FourLenStrs implements Predicate<String> {
        public boolean apply(String input) {
            return input.length() == 4;
        }
    }

}
