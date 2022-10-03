package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  // VALS ARE IMMUTABLE
  // x = 2 <-- CANNOT DO THIS

  // Compiler can infer types

  val aString: String = "Heey"
  val anotherString = "Hoho"

  val aChar:Char = 'a'
  val myBoolean:Boolean = true

  val aShort:Short = 16
  val aLong:Long = 143124312412341243
  val aFloat:Float = 2.0f
  val aDouble:Double = 4.3

  // variables
  var myVariable:Int = 43
  myVariable = 3 // side effects
  myVariable += 1

  // Prefer vals instead of var
}
