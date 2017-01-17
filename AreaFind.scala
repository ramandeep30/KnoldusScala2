object AreaFind {
 def area(shape: String, first: Int, second: Int, f:(Int,Int)=>Int): String= {           //Higher Order Function to find area 
  
 shape match {                                                                           // Cases for different shapes
    case "Parallelogram" => s"Area is ${f(first,second)}"
    case "Rhombus" => s"Area is ${f(first,second)}"
    case "Rectangle" => s"Area is ${f(first,second)}"
    case _ => s"Enter your Correct Choice"

 }
}
     
 def main(args : Array[String]) {
  println(area("Rhombus",5,6,(x,y)=>x*y))
  println(area("Parallelogram",5,6,(x,y)=>(x*y)/2))
  println(area("Rectangle",5,6,(x,y)=>(x*y)))
  
   }
}




