package fragments.objects

object mapOp extends App {

  val numberList = List(9, -7, 2)
  
  // Double each member via map
  def double(x: Int) = { 2 * x }
  
  val doubleList1 = numberList map (double)
  val doubleList2 = numberList map (x => 2 * x)
  val doubleList3 = numberList map (2 * _)

  // Output results
  println(numberList)
  println(doubleList1)
  println(doubleList2)
  println(doubleList3)
}