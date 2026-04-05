package com.rockthejvm.playground.part1basics

object ValuesAndTypes {

  // values cannot be reassigned
  val meaningOfLife: Int = 42

  // type inference
  val anInteger = 67 + 34

  // common types
  val aBoolean: Boolean = false // or true
  val aChar: Char = 'a' // chars uses single quotes

  val anInt: Int = 45 // 4 bytes
  val aShort: Short = 5243 // 2 bytes
  val aLong: Long = 5454354354353L // 8 byte integers
  val aFloat: Float = 2.4f // 4-byte decimal
  val aDouble: Double = 3.14 // 8-byte decimal

  // string type
  val aString: String = "Scala Rocks" // regular strings uses ", it also includes a null terminator, \0
  // Strings are a value, a container and a stop sign, whereas chars are just the value

  def main(args: Array[String]): Unit = {

  }
}
