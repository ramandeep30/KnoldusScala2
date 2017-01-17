object ListAdd {
def main(args : Array[String]) {
val myList1=List(1,2,3)            // List 1
val myList2=List(5,6,7)            // List 2
val resultList=List()              // Resultant List=List1 + List2
for(i <- 0 to 2)
  println(myList1(i)+myList2(i))

 }
}
