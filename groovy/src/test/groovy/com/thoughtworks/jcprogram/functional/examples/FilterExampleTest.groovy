package com.thoughtworks.jcprogram.functional.examples

import org.junit.Test

class FilterExampleTest {
    @Test
    void shouldRemoveOddNumbers() {
        assert([3].findAll {it%2==0} == [])
    }

    @Test
    void shouldLeaveEvenNumbers() {
        assert([4].findAll {it%2==0} == [4])
    }

    @Test
    void shouldFilterListWithMoreThanOneElement() {
        assert([1, 2, 3, 4].findAll {it%2==0} == [2, 4])
    }
}
