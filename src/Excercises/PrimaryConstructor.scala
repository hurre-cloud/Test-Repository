package Excercises

class PrimaryConstructor(private val fName: String, var lName: String) {
 private val home = System.getProperty("user.home")

 println("Constructor Begin")
 var age = 0

 def getFirstName {
  println(fName)
 }

 override def toString = s"$fName $lName is $age year old"

 def printHome {
  println(s"Home =$home")
 }

 def printFullName {
  println(this)
 }

 printHome
 printFullName
 println("Still in a constructor")


}
