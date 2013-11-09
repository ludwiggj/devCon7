package fragments.objects

object g_groupByAndFoldLeft extends App  {

  val sesameStreet: List[String] =
    List("Ernie", "lives", "on", "Sesame", "Street", "with", "his", "friend", "Burt")

  val groupedByWordLength  = sesameStreet groupBy (_.length)
  val groupedByFirstLetter = sesameStreet groupBy (_.toLowerCase.head)

  val numbers = List(1, 2, 3, 4, 5)
  // List(x1, ..., xn) foldLeft(seed)(fn) = ( ... (seed fn x1) fn ... ) fn xn

  // Sum of 1 to 5... 
  val sum = numbers.foldLeft(0)(_ + _)     // = 0 + 1 + 2 + 3 + 4 + 5

  // Product of 1 to 5... 
  val product = numbers.foldLeft(1)(_ * _) // = 1 * 1 * 2 * 3 * 4 * 5

  // Output results
  println("groupedByWordLength  = " + groupedByWordLength)
  println()
  println("groupedByFirstLetter = " + groupedByFirstLetter)
  println()
  println("Sum     of 1..5 = " + sum)
  println("Product of 1..5 = " + product)
  
}