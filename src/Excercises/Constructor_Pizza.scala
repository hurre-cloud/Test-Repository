package Excercises

//Primary Constructor
class Constructor_Pizza(var crustSize: Int, var crustType: String) {

  //Auxiliary Constructor
  def this(crustSize: Int) {
    this(crustSize, Constructor_Pizza.DEFAULT_CRUST_TYPE)
  }

  def this(crustType: String) {
    this(Constructor_Pizza.DEFAULT_CRUST_SIZE, crustType)
  }

  def this() {
    this(Constructor_Pizza.DEFAULT_CRUST_SIZE, Constructor_Pizza.DEFAULT_CRUST_TYPE)
  }
}

object Constructor_Pizza extends App {
  val DEFAULT_CRUST_TYPE = "thin"
  val DEFAULT_CRUST_SIZE = 12

  val p1 = new Constructor_Pizza
  println(p1.crustType)
  println(p1.crustSize)

  val p2 = new Constructor_Pizza(11)
  println(p2.crustSize)
  println(p2.crustType)

  val p3 = new Constructor_Pizza(crustType = "thick")
  println(p3.crustSize)
  println(p3.crustType)

  val p4 = new Constructor_Pizza(Constructor_Pizza.DEFAULT_CRUST_SIZE, Constructor_Pizza.DEFAULT_CRUST_TYPE)
  println(DEFAULT_CRUST_SIZE)
  println(DEFAULT_CRUST_TYPE)
}
