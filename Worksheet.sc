val list = List.range(1, 10)
list.foreach(println(_))

val double1 = (i:Int)=>{i*2}

double1(2)

def executeAndPrint(f:(Int,Int)=>Int,x:Int,y:Int) {
  val result = f(x, y)
  println(result)
}

val printChar = (a:Any, b:Any)=> {println(a)
  println(b)}












