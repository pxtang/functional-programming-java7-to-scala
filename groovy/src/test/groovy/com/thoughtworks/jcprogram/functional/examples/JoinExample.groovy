package com.thoughtworks.jcprogram.functional.examples

import org.junit.Test
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class JoinExample {
    @Test
    public void shouldJoinStrings(){
        def joinedNumbers = [1, 2, 3].join("|")
        assertThat(joinedNumbers, is("1|2|3"));
    }
}
