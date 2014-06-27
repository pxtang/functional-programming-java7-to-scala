package com.thoughtworks.jcprogram.functional.exercises

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

object IntegerReporter {
  def main(args: Array[String]) {
    val numbers = Seq(1, 9, 4, 16, 4)

    numbers.foreach(println)
  }
}
