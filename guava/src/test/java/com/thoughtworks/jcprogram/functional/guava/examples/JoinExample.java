package com.thoughtworks.jcprogram.functional.guava.examples;

import com.google.common.base.Joiner;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JoinExample {
    @Test
    public void shouldInsertDelimiterBetweenStrings() {
        List<String> someStrings = newArrayList("Able", "Baker", "Charlie");

        String join = Joiner.on("|").join(someStrings);

        assertThat(join, is("Able|Baker|Charlie"));
    }
}
