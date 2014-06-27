package com.thoughtworks.jcprogram.functional.exercises

import org.junit.Test
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class FilterExample {

    @Test
    void shouldRemoveOddNumbers() {
        assertThat([1, 2, 3, 4].findAll {it%2==0}, is([2, 4]))
    }
}
