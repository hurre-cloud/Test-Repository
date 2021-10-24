package Excercises

object StringOperation extends App {

  val s = "hello"

  s.foreach(println)
  println(s.filter(x => x != 'l'))

  println(s.drop(3).take(1).capitalize)

  println(s.compareTo("hel"))

  //for loop with yeild
  val result = for {
    c <- s
    if c != 'h'
  } yield c.toUpper
  println(result)

  val result1 = s.filter(_ != 'h').map(_.toUpper)
  println(result1)

  val func = (c: Char) => c.toUpper
  //println(func)
  println(s.map(func))

}
