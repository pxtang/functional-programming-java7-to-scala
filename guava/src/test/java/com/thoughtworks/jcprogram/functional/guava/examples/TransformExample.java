package com.thoughtworks.jcprogram.functional.guava.examples;

import com.google.common.base.Function;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TransformExample {
    @Test
    public void shouldDivideAllNumbers() {
        List<Integer> actual = transform(newArrayList(3, 6, 9), new DivideFunction(3));
        List<Integer> expected = newArrayList(1, 2, 3);
        assertThat(actual, is(expected));
    }

    private static class DivideFunction implements Function<Integer, Integer> {
        private int numberToDivideBy;

        public DivideFunction(int numberToDivideBy) {
            this.numberToDivideBy = numberToDivideBy;
        }

        public Integer apply(Integer integer) {
            return integer / numberToDivideBy;
        }
    }

}
