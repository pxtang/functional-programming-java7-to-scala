package com.thoughtworks.jcprogram.functional.examples;


import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilterExample {

    @Test
    public void shouldRemoveOddElements(){
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;

        List<Integer> numbersWithoutOdds = asList(1, 2, 3, 4)
                .stream()
                .filter(isEvenPredicate)
                .collect(Collectors.<Integer>toList());

        assertThat(numbersWithoutOdds, is(asList(2, 4)));
    }
}
