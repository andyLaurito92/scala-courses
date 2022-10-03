package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  // Instructions (DO) vs Expressions (VALUE)
  // If in scala are expressions

  var myVariable = 3
  myVariable += 3

  if (myVariable == 3) 5 else 3

  // Everything in Scala is an expression :)
  var i = 0
  while (i < 3) {
    println(i)
    i += 1
  }


  // Unit == void
  val weiredValue= (myVariable = 3) // Unit
  println(weiredValue)

  // side effects = println(), whiles, reassiging --> These are expressions that return Unit

  // Code blocks
  val aCodeBlock = { // This is an expression
    val y = 2
    val myx = 3

    // Value of a code block is the value of the last expression executed in the code block
  }

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 988
    42
  }

  println(someValue)
  println(someOtherValue)
}
