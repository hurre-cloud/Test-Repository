package Excercises

import scala.annotation.switch

object CaseDemo extends App {

  def switchMethod(x: Any): String = x match {
    case s: String => s"$s is a string"
    case i: Int => "Int"
    case f: Float => "float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"

  }

  case class Person(name: String)

  print(switchMethod(Person("abc")))


}
