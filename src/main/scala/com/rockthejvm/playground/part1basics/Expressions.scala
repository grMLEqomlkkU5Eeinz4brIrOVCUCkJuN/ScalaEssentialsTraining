package com.rockthejvm.playground.part1basics

object Expressions {
  // structures that evaluate to a value
  val meaningOfLife = 40 + 2 // is an expression because it evaluates to 42

  // expressions that compose of + - * /, bitwise | & >> <<
  val mathExpression = 2 + 3 * 4 // 14

  // boolean expressions
  val equalityTest = 1 == 2 // expression returns true or false

  // if expressions
  val anIfExpression = if (equalityTest) 45 else 99
  val anIfExpression_v2 = if equalityTest then 45 else 99 // alternative method for expressing the same thing

  // code blocks are also expressions
  val aCodeBlock = {
    // can define local values
    val localValue = 78
    // a bunch of expressions

    // last value = the value of the ENTIRE BLOCK
    localValue + 99
  }

  // an expression, simply; is a unit of code that can be evaluated to produce a value
  // everything in scala is an expressions


  // indentation syntax
  val aCodeBlock_v2 =
    val localValue = 78
    localValue + 99

  // pattern matching
  val someValue = 42

  // inferred to be a string that evaluates based on someValue
  val description = someValue match {
    case 1 => "the first"
    case 2 => "second"
    case 42 => "meaning of life"
    case _ => "something else"
  }

  def main(args: Array[String]): Unit = {
    println(anIfExpression)
    println(if (equalityTest) 45 else 99) // can be printed here
    println(aCodeBlock) // 177

    println({
      // can define local values
      val localValue = 78
      // a bunch of expressions

      // last value = the value of the ENTIRE BLOCK
      localValue + 99
    })

    println(description)
  }
}
