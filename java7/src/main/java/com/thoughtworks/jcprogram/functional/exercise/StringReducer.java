package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = asList("Bill", "Archer", "Lana");

        System.out.println("------------ Java 7: StringReducer ------------");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        String output = "";

        for (String string : strings) {
            if (string.length() == 4)
                output += string.charAt(0);
        }

        return output;
    }
}
