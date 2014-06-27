package com.thoughtworks.jcprogram.functional.exercises

import org.junit.Test
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class JoinExample {
    @Test
    public void shouldJoinStrings(){
        assertThat([1, 2, 3].join("|"), is("1|2|3"));
    }
}
