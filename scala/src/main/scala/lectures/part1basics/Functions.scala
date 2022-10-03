package lectures.part1basics

object Functions extends App {
  def aFunction(a:String, b:Int):String =
    a + " " + b

  println(aFunction("hello", 3))

  def anotherFunction(aParameter:Unit) = {
    // This function equals a code block
    println(aParameter.getClass())
  }

  def aRepeatedFunction(patternToRepeat:String, numTimes:Int):String =
    if (numTimes == 1) patternToRepeat
    else patternToRepeat + " " + aRepeatedFunction(patternToRepeat, numTimes - 1)

  println(aRepeatedFunction("hello", 3))
}
