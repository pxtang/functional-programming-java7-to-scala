package com.thoughtworks.jcprogram.functional.examples

import org.junit.Test
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class TransformExample {

    @Test
    void shouldDivideAllNumbers() {
        assertThat([5,6].collect {(int)it/3}, is([1,2]))
    }
}
