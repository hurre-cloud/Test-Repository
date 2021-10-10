package Excercises

object CaseStatement extends App {

  def getClassAsString(x: Any): String = x match {
    case s: String => s"you gave me this string: $s"
    case i: Int => s"i is a Integer"
    case _ => s"Unknown"
  }

  print(getClassAsString("Rakhi"))

}
