package com.thoughtworks.jcprogram.functional.examples;

import org.junit.Test;

import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JoinerExample {

    @Test
    public void shouldJoinNumbers() {
        String joined = asList(123, 456, 789).stream()
                .map(Object::toString)
                .collect(Collectors.joining(","));

        assertThat(joined, is("123,456,789"));
    }
}
