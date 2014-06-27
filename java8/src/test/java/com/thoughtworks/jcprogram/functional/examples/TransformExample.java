package com.thoughtworks.jcprogram.functional.examples;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TransformExample {

    @Test
    public void shouldDivideAllNumbers(){
        Integer divisor = 3;

        List<Integer> someNumbers = asList(3, 6, 9);
        List<Integer> divide = someNumbers
                .stream()
                .map(integer -> integer / divisor)
                .collect(Collectors.<Integer>toList());

        assertThat(divide, is(asList(1, 2, 3)));
    }

}
