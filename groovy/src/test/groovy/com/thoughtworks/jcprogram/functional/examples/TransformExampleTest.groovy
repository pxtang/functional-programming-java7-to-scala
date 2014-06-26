package com.thoughtworks.jcprogram.functional.examples

import org.junit.Test

class TransformExampleTest {

    @Test
    void shouldGetOneWhenDividingANumberByItself() {
        def number = 5
        def divisor = 5
        assert [number].collect {it/divisor} == [1]
    }

    @Test
    void shouldRoundDown() {
        def number = 8
        def divisor = 3
        assert([number].collect {(int)it/divisor} == [2])
    }
}
