package com.thoughtworks.jcprogram.functional.examples

import org.junit.Test

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class FilterExample {

    @Test
    void shouldRemoveOddNumbers() {
        def evenNumbers = [1, 2, 3, 4].findAll { it % 2 == 0 }
        assertThat(evenNumbers, is([2, 4]))
    }
}
