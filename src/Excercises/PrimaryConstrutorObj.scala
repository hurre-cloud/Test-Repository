package Excercises

object PrimaryConstructorObj extends App {
  val obj1 = new PrimaryConstructor("Adam", "Mayer")
  val obj2 = new PrimaryConstructor("tuert", "jain")
  obj2.age = 30

  // println(obj1.fName)
  println(obj2.lName)
  println(obj2.getName)
  println(obj2.age)

}
