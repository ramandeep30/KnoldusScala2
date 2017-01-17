
object Fibonacci {

 def fib(num : Int)= {
  require(num>0)
  var list :List[Int] = List()
   def innerFib(num : Int, first:Int, second:Int):List[Int]={
     num match {
       case 1 => first :: list
       case 2 => {  first :: (second :: list) }
       case _ =>{ (first+second)::list; innerFib(num-1,second, first+second) }
      }
   
  }
innerFib(num,0,1)
} 
def main(args : Array[String] ) {
  
  val myList = fib(4)
  println(myList)	
}
  }

