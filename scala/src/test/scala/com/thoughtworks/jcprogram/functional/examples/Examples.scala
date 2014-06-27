package com.thoughtworks.jcprogram.functional.examples

import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

class Examples extends AssertionsForJUnit {

  @Test
  def shouldRemoveOddNumbers() {
    assert(Set(3, 4).filter(n => n % 2 == 0) == Set(4))
  }

  @Test
  def shouldDivideBy3() {
    assert(Set(5, 6).map(n => n / 3) == Set(1, 2))
  }

  @Test
  def shouldJoinStrings() {
    assert(Set("Able", "Baker", "Charlie").mkString("|") == "Able|Baker|Charlie")
  }

}